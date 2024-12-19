package es.lili.simple.samples.web;

import es.lili.simple.samples.annotations.CommonApiResponses;
import es.lili.simple.samples.model.Book;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@Validated
@CommonApiResponses
@RequestMapping("/books_management")
public interface BookController {

    Flux<Book> allBooks(
            @Parameter(name = "name", description = "Allows filtering by book name", example = "Title A")
            String name,
            @Parameter(name = "authorName", description = "Allows filtering by author's name", example = "Adam")
            String authorName,
            @Parameter(name = "authorSurname", description = "Allows filtering by author's surname", example = "Will")
            String authorSurname,
            @Parameter(name = "editorial", description = "Allows filtering by books publisher name", example = "Ed.")
            String editorial);

    Flux<Book> booksGenreNameLike(String genreName);

    Mono<Book> bookById(BigDecimal id);

    Mono<BigDecimal> addBook(@RequestBody Book book);

}
