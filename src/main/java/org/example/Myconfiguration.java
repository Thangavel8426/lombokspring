package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfiguration {
    @Bean(name="s1")
    public Student1 raj(){
        return new Student1(10,88);


    }
    @Bean
    public Student2 arun(){
     Student2 s2= new Student2();
    s2.setA(23);
    s2.setB(24);
    s2.setStr("arun");
    return s2;}







}
