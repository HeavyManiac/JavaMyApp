
package com.java.myApp.car;

public class Person {
    // Variables
    //private int personCounter = 0;
    private static int personCounter = 0; // static to the class

    private Name personName;

    // Constructor
    public Person(){
        //personCounter = 1 + personCounter;
        personCounter++;
    }

    public String helloHeavy( String name) {
        return "Hello " + name;
    }

    public Name returnName() {
        return personName;
    }


    //public int numberOfPersons() {
    // if you have a static variable also the method should be static
    public static int numberOfPersons() {
        return personCounter;
    }
}
