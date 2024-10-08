package org.example.annonymous_class;

public class Example2 {

    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            public void walk() {
                System.out.println("I am walking in anon class");
            }

            public void show(){
                System.out.println("Hi");
            }
        };
//        a.show();
        a.walk();
        a.walk();

        Dog dog = new Dog();
        dog.show();
        dog.walk();

        Animal dog1 = new Dog();
        dog1.walk();
//        dog1.show();
        Dog dog2 = new Dog(){
            public void show(){
                System.out.println("Override");
            }
        };
        dog2.show();
        dog2.walk();
    }
}


interface Animal{
    void walk();
}

class Dog implements Animal{

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    public void show(){
        System.out.println("Hello");
    }

}
