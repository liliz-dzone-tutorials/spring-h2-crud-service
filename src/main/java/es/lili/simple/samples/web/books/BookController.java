package es.lili.simple.samples.web.books;

import es.lili.simple.samples.model.Book;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RequestMapping("/books")
@Tag(name = "Book Management", description = "This API allows the user to manage their library")
public interface BookController {

    @Operation(description = "Retrieve all books stored in database",
            method = "GET", summary = "Retrieve all books")
    Flux<Book> books();

    @Operation(description = "Retrieve book by its unique id",
            method = "GET", summary = "Retrieve book by id")
    Mono<Book> bookId(Long id);


    @Operation(description = "Retrieve books that have a matching field value as in the filter",
            method = "GET", summary = "Retrieve books filtered")
    Flux<Book> booksFiltered(String name, String authorName, String authorSurname, String editorial, List<Long> genres);

    @Operation(description = "Register new book in database", method = "POST", summary = "Add book")
    Mono<Book> addBook(Book book);

    @Operation(description = "Delete book so from database",
            method = "DELETE", summary = "Delete book")
    Mono<Long> deleteBook(Long id);

    @Operation(description = "Update book's genres", method = "PATCH", summary = "Update book")
    Mono<Book> updateBook(Book book);
}
