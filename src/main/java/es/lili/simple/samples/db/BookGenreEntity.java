package es.lili.simple.samples.db;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book_genres")
@IdClass(BookGenreEntityPk.class)
public class BookGenreEntity {

    @Id
    @Column(name = "book_id")
    private BigDecimal bookId;
    @Id
    @Column(name = "genre_id")
    private Long genreId;
}
