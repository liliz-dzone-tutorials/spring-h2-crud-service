package es.lili.simple.samples.web.books.impl;

import es.lili.simple.samples.model.Book;
import es.lili.simple.samples.web.books.BookController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookControllerImpl implements BookController {


    @Override
    @GetMapping
    public Flux<Book> books() {
        return null;
    }

    @Override
    @GetMapping("/id/{id}")
    public Mono<Book> bookId(@PathVariable(name = "id") Long id) {
        return null;
    }

    @Override
    @GetMapping("/filters")
    public Flux<Book> booksFiltered(
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "authorName", required = false) String authorName,
            @RequestParam(name = "authorSurname", required = false) String authorSurname,
            @RequestParam(name = "editorial", required = false) String editorial,
            @RequestParam(name = "genres", required = false) List<Long> genres) {
        return null;
    }

    @Override
    @PostMapping
    public Mono<Book> addBook(Book book) {
        return null;
    }

    @Override
    @DeleteMapping("/id/{id}")
    public Mono<Long> deleteBook(@PathVariable(name = "id") Long id) {
        return null;
    }

    @Override
    @PatchMapping
    public Mono<Book> updateBook(Book book) {
        return null;
    }
}
