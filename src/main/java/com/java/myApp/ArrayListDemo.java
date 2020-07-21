package com.java.myApp;
import java.util.*;
import java.util.ArrayList;

public class ArrayListDemo {
    private int iSize = 5;

    ArrayListDemo(int size) {
        this.iSize = size;
    }

    public int getSize() {
        return iSize;
    }

    public void Demo(){
        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(iSize);

        // use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(22);
        arrlist.add(30);
        arrlist.add(40);

        // adding element 25 at third position
        arrlist.add(2,25);

        // let us print all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
    }

}
