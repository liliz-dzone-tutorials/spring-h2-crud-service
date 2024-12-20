package es.lili.simple.samples.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Book {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    @Pattern(regexp = "^[a-zA-Z0-9 _ -/?!¿¡]{1,100}$")
    private String name;
    @JsonProperty("authorName")
    @Pattern(regexp = "^[a-zA-Z0-9 _ -/?!¿¡]{1,100}$")
    private String authorName;
    @JsonProperty("authorSurname")
    @Pattern(regexp = "^[a-zA-Z0-9 _ -/?!¿¡]{1,100}$")
    private String authorSurname;
    @JsonProperty("authorFullName")
    @Pattern(regexp = "^$|^[a-zA-Z0-9 _ -/?!¿¡]{1,100}$")
    private String authorFullName;
    @JsonProperty("editorial")
    @Pattern(regexp = "^$|^[a-zA-Z0-9 _ -/?!¿¡]{1,100}$")
    private String editorialName;
    @JsonProperty("genres")
    private List<Genre> genres;

}
