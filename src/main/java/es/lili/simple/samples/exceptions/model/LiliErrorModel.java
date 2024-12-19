package es.lili.simple.samples.exceptions.model;

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
public class LiliErrorModel {

    private String code;
    private String name;
    private String shortMessage;
    private String description;
    private String exceptionMessage;
    private LocalDateTime timestamp;
    private HttpStatus httpStatus;
}
