package es.lili.simple.samples.configuration;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi booksOpenApi() {
        String[] packagesToscan = {"es.lili.simple.samples.web.books", "es.lili.simple.samples.model"};
        return GroupedOpenApi.builder().group("book-management").packagesToScan(packagesToscan).build();
    }

    @Bean
    public GroupedOpenApi genresOpenApi() {
        String[] packagesToscan = {"es.lili.simple.samples.web.genres", "es.lili.simple.samples.model"};
        return GroupedOpenApi.builder().group("genre-management").packagesToScan(packagesToscan).build();
    }

}
