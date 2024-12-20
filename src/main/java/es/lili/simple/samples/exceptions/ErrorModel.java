package es.lili.simple.samples.exceptions;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorModel {

    @JsonProperty("httpCode")
    private int httpCode;
    @JsonProperty("httpMessage")
    private String httpMessage;
    @JsonProperty("internalCode")
    private String internalCode;
    @JsonProperty("shortMessage")
    private String shortMessage;
    @JsonProperty("exceptionMessage")
    private String exceptionMessage;
}
