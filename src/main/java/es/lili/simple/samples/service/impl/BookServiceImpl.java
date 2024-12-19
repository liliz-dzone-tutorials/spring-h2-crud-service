package es.lili.simple.samples.service.impl;

import es.lili.simple.samples.db.repository.BookGenreRepository;
import es.lili.simple.samples.db.repository.BookRepository;
import es.lili.simple.samples.service.BookService;
import es.lili.simple.samples.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookGenreRepository bookGenreRepository;
    private final GenreService genreService;

}
