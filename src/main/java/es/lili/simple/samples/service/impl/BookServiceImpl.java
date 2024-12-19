package es.lili.simple.samples.service.impl;

import es.lili.simple.samples.db.BookSpecification;
import es.lili.simple.samples.db.BookEntity;
import es.lili.simple.samples.db.BookGenreRepository;
import es.lili.simple.samples.db.BookRepository;
import es.lili.simple.samples.mapper.BookMapper;
import es.lili.simple.samples.model.Book;
import es.lili.simple.samples.model.BookResponse;
import es.lili.simple.samples.service.BookService;
import es.lili.simple.samples.service.GenreService;
import es.lili.simple.samples.exceptions.ex4xx.LiliNotFoundException;
import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookGenreRepository bookGenreRepository;
    private final GenreService genreService;
    private final BookMapper bookMapper;

    @Override
    public Flux<Book> allBooks(String name, String authorName, String authorSurname, String editorial) {
        Specification<BookEntity> bookFilter = Specification
                .where(StringUtils.isBlank(name) ? null : BookSpecification.bookNameLike(name))
                .and(StringUtils.isBlank(authorName) ? null : BookSpecification.authorNameLike(authorName))
                .and(StringUtils.isBlank(authorSurname) ? null : BookSpecification.authorSurnameLike(authorSurname))
                .and(StringUtils.isBlank(editorial) ? null : BookSpecification.editorialLike(editorial));

        return Flux.fromIterable(bookRepository.findAll(bookFilter))
                .flatMap(this::mapEntityToBookDto)
                .flatMap(this::searchGenreIdsByBookId);
    }

    public Flux<Book> allBooks() {
        return Flux.fromIterable(bookRepository.findAll())
                .flatMap(this::mapEntityToBookDto)
                .flatMap(this::searchGenreIdsByBookId);
    }

    private Mono<Book> mapEntityToBookDto(BookEntity bookEntity) {
        return Mono.just(bookMapper.mapBookEntityToDto(bookEntity));
    }

    private Mono<Book> searchGenreIdsByBookId(Book book) {
        var genres = bookGenreRepository.findAllGenresOfABook(book.getId());
        if (CollectionUtils.isEmpty(genres)) {
            return Mono.just(book);
        } else {
            return findGenreInformation(genres, book);
        }
    }

    private Mono<Book> findGenreInformation(List<Long> genreIds,Book book) {
        var genres = genreService.findGenreInformation(genreIds);
        if (!CollectionUtils.isEmpty(genres)) {
            book.setGenres(genres);
        }
        return Mono.just(book);
    }

    @Override
    public Mono<BookResponse> allBooksPaginated(int size, int page) {
        return null;
    }

    @Override
    public Flux<Book> booksGenreNameLike(String name) {
        var genres = genreService.retrieveGenreIdsWithNameMatching(name);
        if (CollectionUtils.isEmpty(genres)) {
            throw new LiliNotFoundException("GRNF002");
        } else {
            var bookIds = bookGenreRepository.findAllBooksWithGenreIn(genres);
            return retrieveBookByIds(bookIds).flatMap(this::searchGenreIdsByBookId);
        }
    }

    @Override
    public Mono<Book> bookById(BigDecimal id) {
        var book = bookRepository.findById(id);
        if (book.isPresent()) {
            var mappedBook = bookMapper.mapBookEntityToDto(book.get());
            mappedBook.setGenres(genreService.findGenreInformation(bookGenreRepository.findAllGenresOfABook(id)));
            return Mono.just(mappedBook);
        } else {
            throw new LiliNotFoundException("GRNF002");
        }
    }

    @Override
    public Mono<BigDecimal> addBook(Book book) {
        return null;
    }

    private Flux<Book> retrieveBookByIds(List<BigDecimal> bookIds) {
        return Flux.fromIterable(bookRepository.findAllById(bookIds))
                .flatMap(this::mapEntityToBookDto);
    }
}
