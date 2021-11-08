package io.kioko.movie_catalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author kioko
 */

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient.Builder getWebBuilder () {
        return WebClient.builder();
    }
}
