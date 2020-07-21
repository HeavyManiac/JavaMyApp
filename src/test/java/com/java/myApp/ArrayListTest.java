package com.java.myApp;
import org.junit.Test;

import java.util.*;
import java.util.ArrayList;

public class ArrayListTest {
    private final int INITIAL_CAPACITY = 5;

    @Test
    public void shouldDemonstrateArrayList(){
        //Collection<String> elements = new ArrayList<>(INITIAL_CAPACITY); //or <String>
        List<String> elements = new ArrayList<>(INITIAL_CAPACITY); //or <String>
        System.out.println("Empty: " + elements.isEmpty());
        System.out.println("Initial Size: " + elements.size());
        System.out.println("adding... ");
        elements.add("A");
        elements.add("B");
        elements.add("A");
        elements.add("C");
        //elements.add("A");

        // clear the list
        System.out.println("Clear");
        elements.clear();

        //elements with Index due to be List object
        elements.add(0, "T");
        //elements.add(2, "S");

        System.out.println("removing Index 1... ");
        elements.remove(1); //fails if index is for a null element

        //elements.add("E"); // array will create a new array to fit
        //System.out.println("After, Size: " + elements.size());
        //remove
        //elements.remove("A");  //uses the equals method, only one element is taken out
        System.out.println("Empty: " + elements.isEmpty());
        //ask for the size
        System.out.println("After, Size: " + elements.size());

        for (String s : elements)
        {
            System.out.println("Index of "+s+" :"+ elements.indexOf(s)+" LastIndex: "+ elements.lastIndexOf(s));
        }

        System.out.println(elements);
    }

    @Test
    public void ShouldDemoArray(){
        ArrayListDemo myDemo = new ArrayListDemo(10);
        myDemo.Demo();
    }
}
