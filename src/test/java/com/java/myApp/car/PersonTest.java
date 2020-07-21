package com.java.myApp.car;

import java.util.*;

import com.java.myApp.car.LoggingLevel;
import com.java.myApp.car.Person;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    private static final int PENDING = 40; //constant value that will not be changed
    private static final int PROCESSING = 41;
    private static final int PROCESSED = 42;

    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING","PROCESSED"};
    public String[] states() {return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);    }

    private static final String sPENDING = "PENDING";

    private void method(String Text)
    {
        System.out.println(Text);
    };

    @Test
    public void ShouldReturnHello()
    {
        Person heavy = new Person();
        assertEquals("Hello Heavy", heavy.helloHeavy("Heavy") );
        System.out.println(heavy.helloHeavy("Heavy"));

        /*
        Name myName = new Name();
        assertEquals("Heavy", myName.getMyName() );
        System.out.println(myName.getMyName());
        */
    }

    @Test
    public void ShouldReturnHelloHeavy(){
        Person person = new Person();

        assertEquals("Hello Heavy", person.helloHeavy("Heavy"));

    }

    @Test
    public void shouldReturnNumberOfPersons()
    {
        /*
        Person person1 = new Person();
        Person person2 = new Person();
        Person my = new Person();
        */
        for (int i=1; i<4; i++)
        {
            Person my = new Person();
        }
        // numberOfPersons when is not static
        /*
        assertEquals(3, my.numberOfPersons());
        assertEquals(3, person1.numberOfPersons());
        */

        // when is a static method java calls directly the method
        assertEquals(3, Person.numberOfPersons());

        int i=1;
        while (i<4)
        {
            Person my = new Person();
            i++;
        }
        assertEquals(6, Person.numberOfPersons());
        i=1;
        do {
            Person my = new Person();
            i++;
        } while (i<4);
        assertEquals(9, Person.numberOfPersons());
    }

    @Test
    public void shouldBeArray() {
        Person[] persons = new Person[4];
    /*
        Person my = new Person();

        persons[2] = my;
        my = persons[2];
        persons[2] = null; // garbage collector cleans this
        */

        //int[] myInts = new int[];
        //for (int i = 0; i < 4; i++)
        for (int i = 0; i < persons.length; i++)
        {
            persons[i] = new Person();
            System.out.println(
                    persons[i].helloHeavy("Heavy" + String.valueOf(i))
            );
        }

        for (Person person: persons)
        {
            System.out.println(
                person.helloHeavy("Heavy")
            );
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void shouldBeFinal (){
        Person[] persons = new Person[4];
        final Person[] person2 ={persons[0]};

        LoggingLevel state = LoggingLevel.PENDING;
        state = LoggingLevel.PENDING;
        //state = LoggingLevel.PROCESSED;

        /* only add what you need
        if (state.isPending())
        {
            System.out.println("Is pending");
        }
         */

        /* Replace with a switch
        for (LoggingLevel myState: LoggingLevel.values()) {
            //if (state.equals(LoggingLevel.PENDING))
            if (myState == LoggingLevel.PENDING)  {
                callAMethod();
            }
            if (myState==LoggingLevel.PROCESS) {
                callAMethod();
            }
            if (myState==LoggingLevel.PROCESSED) {
                callAMethod();
            }
        }*/

        int myState = PENDING; // from this: int myState = 42
        switch (myState) // from this: switch (state) {
        {
            case PENDING: {
                method("PN");
                // falls through
            }
            case PROCESSING:{
                method("PR");
                break;
            }
            case PROCESSED:{
                method("PD");
                break;
            }
            default: {
                // Throw an error
            }
        } //Switch

        String myString = "Something";
/*
        switch (myString) {
            case "1":
                method("1");
                break;
            case "2":
                method("2");
                break;
            default:
                /* error
        }*/
    }
    @Test
    public void ShouldReturnArray (){
        assertEquals("x","x");
    }

    @Test
    public void shouldCar(){

    }
}