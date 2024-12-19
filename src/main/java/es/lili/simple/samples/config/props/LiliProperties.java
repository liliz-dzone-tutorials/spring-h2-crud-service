package es.lili.simple.samples.config.props;

import es.lili.simple.samples.config.props.restclients.LiliRestClients;
import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Setter
@Getter
@Builder
@Configuration
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "lili-app-props")
public class LiliProperties {

    private LiliRestClients restClients;

}
