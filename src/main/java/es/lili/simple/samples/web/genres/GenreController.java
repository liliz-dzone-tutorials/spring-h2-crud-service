package es.lili.simple.samples.web.genres;

import es.lili.simple.samples.model.Genre;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/genres")
public interface GenreController {

    Flux<Genre> genres();

    Mono<Genre> genreById(Long id);

    Flux<Genre> genreFiltered(String name);

    Mono<Genre> addGenre(Genre genre);

    Mono<Genre> updateGenre(Genre genre);

    Mono<Genre> deleteGenre(Genre genre);

}
