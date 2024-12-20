package es.lili.simple.samples.web.genres;

import es.lili.simple.samples.model.Genre;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/genres")
@Tag(name = "Genre Management", description = "This API allows the user to manage the Genres")
public interface GenreController {

    @Operation(description = "Retrieve all genres that could be assigned to a book",
            method = "GET", summary = "Retrieve all genres")
    Flux<Genre> genres();

    @Operation(description = "Retrieve genre by its unique id",
    method = "GET", summary = "Retrieve genre by id")
    Mono<Genre> genreById(Long id);

    @Operation(description = "Retrieve genres that have a matching name",
    method = "GET", summary = "Retrieve genre by name")
    Flux<Genre> genreFiltered(String name);

    @Operation(description = "Register new Genre in database", method = "POST", summary = "Add genre")
    Mono<Genre> addGenre(Genre genre);

    @Operation(description = "Update genre's name or description", method = "PATCH", summary = "Update genre")
    Mono<Genre> updateGenre(Genre genre);

    @Operation(description = "Delete genre so it cannot be used to classify books",
    method = "DELETE", summary = "Delete genre")
    Mono<Genre> deleteGenre(Genre genre);

}
