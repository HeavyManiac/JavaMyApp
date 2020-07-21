
package com.java.myApp.car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input)  {
    //public void process(String input) throws Exception { //when exception is throw from inside
        /*
        if (log.isDebugEnabled()) {
            log.debug("processing car: ", input); //
        }
        next line substitutes this code
         */
        log.debug("processing car: {} ", input); //
        // log.info("processing car: {} ", input); // only for info
        log.debug("HEAVY debug: " + input);
        log.info("HEAVY info: " + input);
        CarState carState = CarState.from(input);
    }

    public void drive(){
        //without interface Car
        /*
        BMW bmw = new BMW();
        Porsche por = new Porsche();
        Mercedes mer = new Mercedes();
         */
        //With Car interface
        /*
        Car bmw = new BMW();
        Car porsche = new Porsche();
        Car mercedes = new Mercedes();
        */
        Car[] cars = { new BMW(),
                //new Porsche(),
                new Mercedes()};

        /*
        bmw.drive();
        porsche.drive();
        mercedes.drive();
         */
        for (Car car: cars)
        {
            car.drive();
            System.out.println("Message: " + car.message() +
                    " Value: " + car.value() +
                    " Owner: " + car.owner());
        }

    }
}
