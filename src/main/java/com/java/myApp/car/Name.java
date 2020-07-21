package com.java.myApp.car;
import com.sun.org.apache.xpath.internal.objects.XString;

public class Name {

    private String myName = "Heavy";
    //private Name personName;

    public String getMyName()
    {
        return myName;
    }

    // constructor, no default anymore
    public Name( String Name )
    {
        this.myName = Name;
    }
}
