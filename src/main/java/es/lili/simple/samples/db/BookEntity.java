package es.lili.simple.samples.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public class BookEntity {

    @Id
    @Column(name = "id")
    private BigDecimal id;
    @Column(name = "name")
    private String name;
    @Column(name = "authorName")
    private String authorName;
    @Column(name = "authorSurname")
    private String authorSurname;
    @Column(name = "editorial")
    private String editorial;
}
