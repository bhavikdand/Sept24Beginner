package org.example.static_kw;

public class Main {

    public static void main(String[] args) {
        ABC abc = new ABC();
        ABC.s = "Hello";
        System.out.println(abc.num);
        System.out.println(abc.s); //Static member 'org.example.static_kw.ABC.s' accessed via instance reference
        System.out.println(ABC.s);
        abc.print();
        ABC.print();

        ABC one = new ABC();
        System.out.println(one.s);
    }
}


class ABC{
    int num;
    static String s;
    static void print(){
        System.out.println("I am printing something");
//        System.out.println(num);
//        printNum();
    }

    void printNum(){
        System.out.println("Num:" + num);
        System.out.println(s);
        print();
    }
}
