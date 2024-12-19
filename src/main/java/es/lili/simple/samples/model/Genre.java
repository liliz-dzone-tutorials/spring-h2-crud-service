package es.lili.simple.samples.model;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Genre {

    private Long idGenre;
    private String name;
    private String description;
}
