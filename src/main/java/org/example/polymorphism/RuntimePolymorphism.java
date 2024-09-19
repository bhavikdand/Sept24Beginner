package org.example.polymorphism;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        AA a = new CC();
//        a.print();

        a = new BB();
        a.print();

//        a = new AA();
//        a.print();
    }
}

class AA{
    void print(){
        System.out.println("AA");
    }
}


class BB extends AA{
    void print(){
        super.print();
        System.out.println("BB");
    }
}

class CC extends BB{
    void print(){
        System.out.println("CC");
    }
}