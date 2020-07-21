package com.java.myApp.car;

import com.java.myApp.Loggable;

public class BMW implements Car, Loggable, Asset, Property
{

    private boolean driving;

    public void drive(){
        System.out.println("BMW Driving");
    }

    public int value() {
        return 80000;
    }

    public String owner() {
        return "Marcus";
    }

    public String message(){
        return "I am Owner";
    }


}
