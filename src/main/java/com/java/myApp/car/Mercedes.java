package com.java.myApp.car;

import com.java.myApp.Loggable;

public class Mercedes implements Car, Loggable, Asset, Property{
    private boolean driving;

    public void drive(){
        System.out.println("Mercedes Driving");
    }

    public int value() {
        return 20000;
    }

    public String owner() {
        return "Jose";
    }

    public String message(){
        return "Mercedes, I am Owner";
    }

}
