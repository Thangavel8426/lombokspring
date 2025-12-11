package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfiguration {
    @Bean(name="s1")
    public Student raj(){
        return new Student();
    }


}
