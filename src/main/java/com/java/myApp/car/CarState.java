package com.java.myApp.car;

public enum CarState {

    DRIVING, WAITING , PARKING;

    public static CarState from(String State)  {
        //public static CarState from(String State) throws Exception { // needs this when throw exception
        switch(State.toString())         {
            case "DRIVING":{
                return DRIVING;
            }
            case "WAITING":{
                return WAITING;
            }
            case "PARKING":{
                return PARKING;
            }
            default:
            {
                System.out.println("ERROR");
                throw new RuntimeException("ERROR Passed wrong state." + State);
                //throw new Exception("ERROR Passed wrong state." + State); //tha caller takes care of the exception
            }
        }
    }

}
