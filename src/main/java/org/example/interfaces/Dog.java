package org.example.interfaces;

public class Dog implements Animal{


    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void walk() {
        System.out.println("Walk");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }
}
