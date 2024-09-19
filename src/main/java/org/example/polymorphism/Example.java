package org.example.polymorphism;

public class Example {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(c.d);
        A a = c;
//        A a1 = new B();
        System.out.println(a.a);
        System.out.println(a.b);
//        System.out.println(a.c); //Cannot resolve symbol 'c'
//        System.out.println(a.d);

//        C c1 = new A();

        B b = c;
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
//        System.out.println(b.d);
    }
}

class A{
    int a,b;
}

class B extends A{
    int c;
}

class C extends B{
    int d;
}
