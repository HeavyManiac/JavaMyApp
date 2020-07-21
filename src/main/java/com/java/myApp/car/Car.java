package com.java.myApp.car;

public interface Car {
   // no body on interfaces
    /*
    public void drive(){

    }
    The implementation will be done on:
    Mercedes.java BMW.jav and Porsche.java
    */

    // anti patterns
    // public static final int MAX_SPEED = 320;
    // better use enum

    //public void drive(); also works
    void drive(); // methods are public on interfaces
    String message();
    String owner();
    int value();




}
