package com.example.codeclan.FinalFantasyXivApp.configurations;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

public interface WebMvcConfigurer {
    void addCorsMappings(CorsRegistry registry);
}
