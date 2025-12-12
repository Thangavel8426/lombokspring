package org.example;

public class Student1 {
    private int age;
    private int roll;
    public void write(){
        System.out.println("i am writnng");
        System.out.println(age+" "+ roll);
    }

    public Student1(int age, int roll) {
        this.age = age;
        this.roll = roll;
    }
}
