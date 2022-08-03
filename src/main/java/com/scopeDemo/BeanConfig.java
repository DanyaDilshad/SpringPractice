package com.scopeDemo;

import com.demoAnnotation.Doctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.scopeDemo")
public class BeanConfig {

    @Bean
    public Singleton singleton(){
        return new Singleton();
    }

}
