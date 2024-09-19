package org.example.inheritance;

public class Example4 {
    public static void main(String[] args) {
        CCC c = new CCC();
    }
}

class AAA{
    public AAA(){
        System.out.println("A");
    }
    public AAA(int i){
        System.out.println("A = " + i);
    }
}

class BBB extends AAA{
    public BBB(){
        System.out.println("B");
    }
    public BBB(String s){
        super(5);
        System.out.println("B " + s);
    }
}

class CCC extends BBB{
    public CCC(){
        super("hello");
        System.out.println("C");
    }
}
