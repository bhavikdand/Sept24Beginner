package org.example.abs_classes;

public abstract class Animal {

    String name;
    int age;

    void printName(){
        System.out.println(name);
    }

    abstract void walk();
}
