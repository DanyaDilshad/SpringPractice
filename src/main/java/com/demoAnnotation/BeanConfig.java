package com.demoAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.demoAnnotation")
public class BeanConfig {

    @Bean
    public Technician technician(){
        return new Technician();
    }

}
