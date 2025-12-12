package org.example;

import org.springframework.stereotype.Component;

@Component

public class Pencil  implements Writer{
    public void writing()
    {
        System.out.println("Pencil is available");
    }
}
