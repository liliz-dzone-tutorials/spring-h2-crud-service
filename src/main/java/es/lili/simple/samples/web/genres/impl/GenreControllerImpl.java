package es.lili.simple.samples.web.genres.impl;

import es.lili.simple.samples.model.Genre;
import es.lili.simple.samples.web.genres.GenreController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class GenreControllerImpl implements GenreController {

    @Override
    @GetMapping
    public Flux<Genre> genres() {
        return null;
    }

    @Override
    @GetMapping("/id/{id}")
    public Mono<Genre> genreById(@PathVariable(name = "id") Long id) {
        return null;
    }

    @Override
    @GetMapping("/filters")
    public Flux<Genre> genreFiltered(
            @RequestParam(name = "name", required = false) String name) {
        return null;
    }

    @Override
    @PostMapping
    public Mono<Genre> addGenre(Genre genre) {
        return null;
    }

    @Override
    @PatchMapping
    public Mono<Genre> updateGenre(Genre genre) {
        return null;
    }

    @Override
    @DeleteMapping
    public Mono<Genre> deleteGenre(Genre genre) {
        return null;
    }
}
