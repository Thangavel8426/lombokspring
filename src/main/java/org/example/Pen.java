package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class Pen implements Writer {
    public void writing()
    {
        System.out.println("Pen is available");
    }}
