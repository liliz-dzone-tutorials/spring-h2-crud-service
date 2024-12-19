package es.lili.simple.samples.service;

import es.lili.simple.samples.model.Genre;
import reactor.core.publisher.Mono;

import java.util.List;

public interface GenreService {

    boolean isValidGenre(Genre genre);
    List<Genre> findGenreInformation(List<Long> genreIds);

    List<Long> retrieveGenreIdsWithNameMatching(String name);

    Mono<Genre> addGenre(Genre genre);
}
