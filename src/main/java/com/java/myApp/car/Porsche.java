package com.java.myApp.car;

import com.java.myApp.Loggable;
import java.lang.*;

public class Porsche  implements Car, Loggable, Asset, Property, Cloneable
{
    private String sOwner;
    private String sColor;

    //constructor pf the class with one parameter
    Porsche (String Owner, String Color) {
        this.sOwner = Owner;
        this.sColor = Color;
    }

    public String getColor(){ return sColor;}

    public String asString() { return sOwner; }

    public void drive(){
        System.out.println("Porsche Driving");
    }
    public void sellTo(String newOwner)
    {
        this.sOwner = newOwner;
    }

    @Override
    public Porsche clone() { //should be public Object clone()
        // Public to make it visible
        try {
            return (Porsche) super.clone(); // The super class is object and this one has the clone method
                                            // needs to be cast as Porsche
        }  catch (CloneNotSupportedException        e)
        {
            throw new AssertionError(); //cloneable on the implementation
        }
    }

    public int value() {
        return 80800;
    }

    public String owner() {
        //return "Manuel";
        return sOwner;
    }

    public String message(){
        return "Porsche I am Owner";
    }

    //public boolean equals(Porsche p){
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj){
            return true;    // same object on p
        }

        if (obj == null) {
            return false; // null is always not equal
        }
        if ( getClass() != obj.getClass()){ //Different classes is false
            return false;
        }

        Porsche p1 = (Porsche) obj; // now is safe to cast the object into Porsche

        //System.out.println("Owner: "+ this.sOwner+ " Color: "+this.sColor);
        ///System.out.println("Owner: "+ p1.sOwner+ " Color: "+p1.sColor);

        return
         this.sOwner.equals(p1.sOwner) && this.sColor.equals(p1.sColor);
    }

}
