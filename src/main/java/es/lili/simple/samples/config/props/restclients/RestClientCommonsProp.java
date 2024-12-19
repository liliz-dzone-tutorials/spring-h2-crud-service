package es.lili.simple.samples.config.props.restclients;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RestClientCommonsProp {

    private String name;
    private String baseUrl;
    private int readTimeOut;
    private int writeTimeOut;
}
