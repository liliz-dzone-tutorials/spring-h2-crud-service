package es.lili.simple.samples.db.entity;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGenreEntityPk {

    private Long bookId;
    private Long genreId;
}
