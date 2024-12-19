package es.lili.simple.samples.web.impl;

import es.lili.simple.samples.service.BookService;
import es.lili.simple.samples.web.BookController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookControllerImpl implements BookController {

    private final BookService service;

}
