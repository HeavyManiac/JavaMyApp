package com.java.myApp.zoo;

import com.java.myApp.Loggable;
import com.java.myApp.Printable;

public class Lion extends Animal implements Loggable, Printable {

    public void print(){
        System.out.println("printing...");
    }
    public String message(){
        return "x";
    }

    public void eat(){
        System.out.println("Lion is eating...");
    }

}
