package org.example.annonymous_class;

public class Example1 {

    public static void main(String[] args) {
        A a = new A(){
            public void show(){
                System.out.println("I am in anonymous class");
            }

            public void print(){
                System.out.println("I am overriding 2nd method");
            }
        };
        a.show();
        a.print();
    }
}

class A{
    public void show(){
        System.out.println("I am in A");
    }

    public void print(){
        System.out.println("Printing in A");
    }
}
