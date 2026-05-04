package cl.biblioteca.bibliotecaejercicio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
 
 
@Configuration
public class WebClientConfig {
 
    @Bean
    public WebClient pokeApiWebClient(WebClient.Builder builder) {
        return builder.clone().baseUrl("https://pokeapi.co/api/v2").build();
    }

    @Bean
    public WebClient cineApiWebClient(WebClient.Builder builder){
        return builder.clone().baseUrl("http://localhost:8082/api/v1/cine").build();
    }
}
