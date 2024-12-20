package es.lili.simple.samples.web.books;

import es.lili.simple.samples.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RequestMapping("/books")
public interface BookController {
    Flux<Book> books();

    Mono<Book> bookId(Long id);

    Flux<Book> booksFiltered(String name, String authorName, String authorSurname, String editorial, List<Long> genres);

    Mono<Book> addBook(Book book);

    Mono<Long> deleteBook(Long id);

    Mono<Book> updateBook(Book book);
}
