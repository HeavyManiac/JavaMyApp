package com.java.myApp;

import org.junit.Test;


import org.junit.Assert;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class DemoTest {
    private byte myByte;
    private short myShort;
    private long myLong;
    private float myFloat;
    private double myDouble;
    private Object myObject;
    private boolean myBoolean;
    private char myChar;

    @Test
    public void shouldDemonstrateStaticImport(){
        assertTrue(true);   //needs: import static org.junit.Assert.*;
        Assert.assertTrue(true);    //needs: import static org.junit.Assert;

    }

    @Test
    public void shouldDefaultValues(){

        System.out.println("private byte myByte: " + myByte);  //0
        System.out.println("private short myShort: "+myShort ); //0
        System.out.println("private long myLong: "+myLong); //0
        System.out.println("private float myFloat: "+myFloat); //0.0
        System.out.println("private double myDouble: "+myDouble); //0.0
        System.out.println("private Object myObject: "+myObject); //null
        System.out.println("private boolean myBoolean: "+myBoolean); //false
        System.out.println("private char myChar: "+myChar+"'"); //''
    }
    @Test
    public void shouldDemonstrateNumberObjects(){
        Byte b = Byte.parseByte("127");
        System.out.println(b);

    }

    @Test
    public void shouldRanges(){

        System.out.println("private byte myByte: " + Byte.MIN_VALUE+" "+Byte.MIN_VALUE);  //0
        System.out.println("private short myShort: "+Short.MIN_VALUE+" "+Short.MAX_VALUE ); //0
        System.out.println("private long myLong: "+Long.MIN_VALUE+" "+Long.MAX_VALUE); //0
        System.out.println("private float myFloat: "+Float.MIN_VALUE+" "+ Float.MAX_VALUE); //0.0
        System.out.println("private double myDouble: "+Double.MIN_VALUE+" "+Double.MAX_VALUE); //0.0
        System.out.println("private char myChar: "+(int)Character.MIN_VALUE+" "+(int)Character.MAX_VALUE); //''
    }

    @Test
    public void shouldEquals(){
        String hello1 = "Hello";
        String hello2 = "Hello";
        String hello3 = "H";
        hello3 = hello3 + "ello";
        System.out.println(hello3);
        assertTrue(hello1==hello2);
        assertTrue(hello1.equals(hello2));
        assertTrue(hello1.equals(hello3));
        //assertTrue(hello1==hello3);
    }


}
