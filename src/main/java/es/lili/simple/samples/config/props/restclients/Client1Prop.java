package es.lili.simple.samples.config.props.restclients;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Client1Prop extends RestClientCommonsProp {
    private String pathFunctionality1Client1;
    private String pathFunctionality2Client1;
}
