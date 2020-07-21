package com.java.myApp.car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.plugin.dom.exception.InvalidStateException;

public class CarSelector {
    private static Logger LOG = LoggerFactory.getLogger(CarSelector.class);

    public static void main(String[] args) {//throws Exception {
        CarService carSrv = new CarService();
        
        for (String argument : args) {
            /* with try catch
            try {
                carSrv.process(argument);
            }
            catch (RuntimeException e){
                System.out.println("---------- LOG.error:: ----------------------");
                LOG.error(e.toString());
                System.out.println("---------- e.printStackTrace(): -------------");
                e.printStackTrace();
                System.out.println("---------- e.getMessage(): ------------------");
                System.err.println("System.err.println :" + e.getMessage());
                System.out.println("---------------------------------------------");
            }
             */
            if (isvalid(argument)) {
                carSrv.process(argument);
            } else {
                System.err.println("Ignoring invalid parameter: " + argument);
            }

        }
    }

    private static Boolean isvalid(String argument) {
        try {
            CarState carstate = CarState.valueOf(argument); //throws InvalidStateException/InvalidArgumentException
            System.out.println("Valid State: " + argument);
        }
        catch (InvalidStateException e){
            System.out.println("Error InvalidStateException: " + argument);
            return false;
        }
        catch (IllegalArgumentException e){
            System.out.println("Error IllegalArgumentException: " + argument);
            return false;
        }
        finally {
            System.out.println("Finally executed");
        }
        return true;
    }
}
