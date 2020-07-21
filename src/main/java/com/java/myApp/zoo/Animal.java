package com.java.myApp.zoo;
// Changed to be abstract
// public class Animal {
public abstract class Animal { //An abstract class cannot be instanciated
    protected int age;

    //Concrete implementation
    /* public void eat(){
        System.out.print("eat... ");
    }
     */
    //abstract implementation
    public abstract void eat();

    //public void age(){
    //Protected, visible in the whole packages
    //Visible on any class that extends Animal
    protected void age(){
        System.out.println("age... ");
    }

}
