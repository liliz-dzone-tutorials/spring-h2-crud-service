package es.lili.simple.samples.db.entity;

import jakarta.persistence.*;
import lombok.*;

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
    private Long bookId;
    @Id
    @Column(name = "genre_id")
    private Long genreId;
}
