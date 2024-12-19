package es.lili.simple.samples.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {

    private List<Book> books;
    private int page;
    private int totalPages;
    private int size;
}
