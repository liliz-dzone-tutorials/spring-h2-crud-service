package es.lili.simple.samples.service.impl;

import es.lili.simple.samples.db.GenreRepository;
import es.lili.simple.samples.mapper.GenreMapper;
import es.lili.simple.samples.model.Genre;
import es.lili.simple.samples.service.GenreService;
import es.lili.simple.samples.exceptions.ex4xx.LiliNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;
    private final GenreMapper genreMapper;

    @Override
    public boolean isValidGenre(Genre genre) {
        return !isDuplicated(genre.getIdGenre()) && genreNameNotRegistered(genre.getName());
    }

    private boolean genreNameNotRegistered(String name) {
        return CollectionUtils.isEmpty(genreRepository.findByName(name));
    }
    private boolean isDuplicated(Long id) {
        return genreRepository.existsById(id);
    }

    @Override
    public List<Genre> findGenreInformation(List<Long> genreIds) {
        var genres = genreRepository.findAllById(genreIds);
        return genres.stream().map(genreMapper::mapGenreEntityToDto).collect(Collectors.toList());
    }

    @Override
    public List<Long> retrieveGenreIdsWithNameMatching(String name) {
        var genres = genreRepository.findIdsByNameLike(name);
        if (CollectionUtils.isEmpty(genres)) {
            throw new LiliNotFoundException("GRNF002");
        } else {
            return genres;
        }
    }

    @Transactional
    public Mono<Genre> addGenre(Genre genre) {
        var mappedEntity = genreMapper.mapGenreDtoToEntity(genre);
        return Mono.just(genreMapper.mapGenreEntityToDto(genreRepository.save(mappedEntity)));
    }
}
