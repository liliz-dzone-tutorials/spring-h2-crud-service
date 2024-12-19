package es.lili.simple.samples.service;

import es.lili.simple.samples.model.Book;
import es.lili.simple.samples.model.BookResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

public interface BookService {

    Flux<Book> allBooks(String name, String authorName, String authorSurname, String editorial);

    Flux<Book> allBooks();

    Mono<BookResponse> allBooksPaginated(int size, int page);

    Flux<Book> booksGenreNameLike(String name);

    Mono<Book> bookById(BigDecimal id);

    Mono<BigDecimal> addBook(Book book);
}
