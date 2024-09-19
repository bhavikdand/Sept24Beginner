package org.example.inheritance;

public class Example3 {
    public static void main(String[] args) {
        CC c = new CC();
    }
}

class AA{
    public AA(){
        System.out.println("A");
    }
}

class BB extends AA{
    public BB(String s){
        System.out.println("B");
    }
    public BB(int i){

    }
}

class CC extends BB{
    public CC(){
        super("Hello");
        System.out.println("C");
    }
}
