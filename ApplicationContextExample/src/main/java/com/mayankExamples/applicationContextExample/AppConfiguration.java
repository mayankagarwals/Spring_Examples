package com.mayankExamples.applicationContextExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //Required to discover stereotype beans. If you use Spring boot @SpringBootApplication has this by default
public class AppConfiguration {

    @Bean
    public Circle myShape(){
        return new Circle(2.0F);
    }

}
