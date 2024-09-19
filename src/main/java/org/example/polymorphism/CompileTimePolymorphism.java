package org.example.polymorphism;

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.print("Hello");
        p.print("Hello", 5);
    }
}

class Printer{

    void print(){
        System.out.println("I am empty");
    }

    void print(String s){
        System.out.println("s: " + s);
    }

    void print(String a, int i){
        System.out.println(a + " " + i);
    }
}
