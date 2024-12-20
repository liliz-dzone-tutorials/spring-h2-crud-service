package es.lili.simple.samples.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Genre {

    @JsonProperty("id")
    @Schema(name = "id", description = "Genre unique id", type = "Long", example = "5",
            accessMode = Schema.AccessMode.READ_ONLY)
    private Long idGenre;
    @JsonProperty("name")
    @Schema(name = "name", description = "Genre name", type = "String", example = "FANTASY")
    private String name;
    @JsonProperty("description")
    @Schema(name = "description", description = "Genre description", type = "String",
            example = "Fictional worlds and magic")
    private String description;
}
