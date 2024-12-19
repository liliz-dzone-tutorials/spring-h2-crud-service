package es.lili.simple.samples.web.impl;

import es.lili.simple.samples.service.GenreService;
import es.lili.simple.samples.web.GenreController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GenreControllerImpl implements GenreController {

    private final GenreService genreService;
}
