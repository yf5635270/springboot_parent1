package com.yf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author 杨非
 * @date 2026年03月11日 12:07
 */
@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient(){
        return WebClient.create("https://localhost:8080");
    }
}
