package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Myconfiguration {
    @Bean(name="s1")
    public Student1 raj(@Autowired Writer w){
        Student1 s2= new Student1();
        s2.setW(w);
       return s2;

    }


 @Bean
 @Primary
    public Pen p1(){
        return new Pen();
 }
    @Bean
    public Pencil p2(){
        return new Pencil();
    }






}
