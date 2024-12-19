package es.lili.simple.samples.web.impl;

import es.lili.simple.samples.model.Book;
import es.lili.simple.samples.service.BookService;
import es.lili.simple.samples.web.BookController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class BookControllerImpl implements BookController {

    private final BookService service;
    @Override
    @GetMapping
    public Flux<Book> allBooks(@RequestParam(name = "name", required = false) String name,
                               @RequestParam(name = "authorName", required = false) String authorName,
                               @RequestParam(name = "authorSurname", required = false) String authorSurname,
                               @RequestParam(name = "editorial", required = false) String editorial) {
        return service.allBooks(name, authorName, authorSurname, editorial);
    }

    @Override
    @GetMapping("/genre/name/{name}")
    public Flux<Book> booksGenreNameLike(@PathVariable("name") String name) {
        return service.booksGenreNameLike(name);
    }

    @Override
    @GetMapping("/id/{id}")
    public Mono<Book> bookById(@PathVariable("id") BigDecimal id) {
        return service.bookById(id);
    }

    @Override
    @PostMapping
    public Mono<BigDecimal> addBook(Book book) {
        return null;
    }

}
