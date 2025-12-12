package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component


@Data
public class Student1 {



    private Writer w;
    @Autowired
    public Student1(Writer w) {
        this.w = w;
    }

    public void call(){
        w.writing();


    }
}
