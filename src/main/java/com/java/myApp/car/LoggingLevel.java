package com.java.myApp.car;

//Enumerated values
public enum LoggingLevel {


//initial PENDING, PROCESS, PROCESSED
PENDING(1), PROCESS(2), PROCESSED(3);

    // local variable
    private int i;

    // Constructor
    LoggingLevel(int i){
        this.i = i;
    }

    public int code() {
        return i;
    }
    /* only add methods that are need it
    public Boolean isPending(){
        return this == PENDING;
    }
     */

}
