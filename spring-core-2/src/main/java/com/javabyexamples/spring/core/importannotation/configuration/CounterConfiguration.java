package com.javabyexamples.spring.core.importannotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CounterConfiguration {

    @Bean
    public Counter counter() {
        return new Counter();
    }
}
