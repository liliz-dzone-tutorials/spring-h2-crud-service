package es.lili.simple.samples.config.props.restclients;

import es.lili.simple.samples.config.props.restclients.Client1Prop;
import es.lili.simple.samples.config.props.restclients.Client2Prop;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LiliRestClients {

    private Client1Prop client1;
    private Client2Prop client2;
}
