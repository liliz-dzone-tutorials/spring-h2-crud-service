package es.lili.simple.samples.db;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGenreEntityPk {

    private BigDecimal bookId;
    private Long genreId;
}
