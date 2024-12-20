package es.lili.simple.samples.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import lombok.*;

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
    @Schema(name = "id", description = "Book unique id", type = "Long", example = "5",
            accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @JsonProperty("name")
    @Schema(name = "name", description = "Book title", type = "String", example = "The Lord of the Rings")
    @Pattern(regexp = "^[a-zA-Z0-9 _ -/?!¿¡]{1,100}$")
    private String name;

    @JsonProperty("authorName")
    @Pattern(regexp = "^[a-zA-Z0-9 _ -/?!¿¡]{1,100}$")
    @Schema(name = "authorName", description = "Book's author name", type = "String", example = "J.R.R")
    private String authorName;

    @JsonProperty("authorSurname")
    @Pattern(regexp = "^[a-zA-Z0-9 _ -/?!¿¡]{1,100}$")
    @Schema(name = "authorSurname", description = "Book's author surname", type = "String", example = "Tolkien")
    private String authorSurname;

    @JsonProperty("authorFullName")
    @Pattern(regexp = "^$|^[a-zA-Z0-9 _ -/?!¿¡]{1,100}$")
    @Schema(name = "authorFullName", description = "Book's author full name", type = "String",
            example = "J.R.R Tolkien", accessMode = Schema.AccessMode.READ_ONLY)
    private String authorFullName;

    @JsonProperty("editorial")
    @Pattern(regexp = "^$|^[a-zA-Z0-9 _ -/?!¿¡]{1,100}$")
    @Schema(name = "editorialName", description = "Publisher", type = "String", example = "Penguin")
    private String editorialName;

    @JsonProperty("genres")
    @ArraySchema(schema = @Schema(name = "genre", implementation = Genre.class, description = "Genre"))
    private List<Genre> genres;

}
