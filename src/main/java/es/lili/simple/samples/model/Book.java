package es.lili.simple.samples.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String name;
    private String authorName;
    private String authorSurname;
    private String authorFullName;
    private String editorialName;
    private List<Genre> genres;

    @JsonIgnore
    private BigDecimal id;
}
