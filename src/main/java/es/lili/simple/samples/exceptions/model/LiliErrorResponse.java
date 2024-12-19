package es.lili.simple.samples.exceptions.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LiliErrorResponse {

    private int httpStatusCode;
    private String httpStatusReasonPhrase;
    private LocalDateTime timestamp;
    private LiliErrorModel error;

    @JsonIgnore
    private HttpStatus httpStatus;
}
