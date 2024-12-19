package es.lili.simple.samples.config;

import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class LiliSwaggerConfig {

    @Bean
    public GroupedOpenApi booksOpenApi() {
        String[] packagesToscan = {"es.lili.simple.samples.bookmanagement"};
        return GroupedOpenApi.builder().group("book-management").packagesToScan(packagesToscan).build();
    }

    @Bean
    public GroupedOpenApi usersOpenApi() {
        String[] packagesToscan = {"es.lili.simple.samples.usermanagement"};
        return GroupedOpenApi.builder().group("user-management").packagesToScan(packagesToscan).build();
    }

    @Bean
    public GroupedOpenApi trackerOpenApi() {
        String[] packagesToscan = {"es.lili.simple.samples.readingtracker"};
        return GroupedOpenApi.builder().group("tracker").packagesToScan(packagesToscan).build();
    }
}
