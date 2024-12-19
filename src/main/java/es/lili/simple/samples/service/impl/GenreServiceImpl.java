package es.lili.simple.samples.service.impl;

import es.lili.simple.samples.db.repository.GenreRepository;
import es.lili.simple.samples.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;
}
