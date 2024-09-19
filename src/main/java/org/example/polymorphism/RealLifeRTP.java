package org.example.polymorphism;

import java.util.Random;

public class RealLifeRTP {
    public static void main(String[] args) {
//        for(int i=0; i<10; i++) {
//            User u = getRandomUser();
//            u.login();
//        }
        User u = getRandomUser();
        if(u instanceof Instructor){
            // code to login as instructor
        } else if(u instanceof Mentor){
            //code for mentor to login
        } else {
            //code for learner to login
        }
    }

    private static User getRandomUser() {
        Random r = new Random();
        int num = r.nextInt();
        if(num%3 == 0){
            return new Instructor();
        }
        if(num%3==1){
            return new Learner();
        }
        return new Mentor();
    }
}

class User{
    void login(){
        System.out.println("User is logging in");
    }
}

class Instructor extends User{
    void login(){
        System.out.println("Inst is logging in");
    }
}

class Mentor extends User{
    void login(){
        System.out.println("Mentor is logging in");
    }
}

class Learner extends User{
    void login(){
        System.out.println("Learner is logging in");
    }
}
