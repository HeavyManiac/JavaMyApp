package com.java.myApp.zoo;

public class Gorilla extends Animal {

    //override a method from Animal
    //Age cannot be private
    public void age(){
        System.out.println("Gorilla is implementing age...");
    }
    public void eat(){
        System.out.println("Gorilla is eating...");
    }
}
