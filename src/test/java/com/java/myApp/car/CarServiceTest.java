package com.java.myApp.car;
import static org.junit.Assert.*;
import com.java.myApp.car.CarSelector;
import com.java.myApp.car.CarService;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class CarServiceTest {

    @Test
    public void shouldDemonstrateLogging(){
        CarService carService = new CarService();
        carService.process("BMW");
    }

    @Test
    public void shouldTestMain(){
        String [] arguments = {"BMW","PORCHE", "Mercedes"};
        CarSelector.main(arguments);
    }

    @Test
    public void shouldDemonstrateInterfaces(){
        CarService carservice = new CarService();
        carservice.drive();

    }

    @Test
    public void shouldCloneArray(){
        String[] array = {"one","2","three"};
        String[] copiedArray = array.clone();

        //assertSame(array, copiedArray);
        assertNotSame(array, copiedArray);
        System.out.println(copiedArray[0]);

        for (String str : copiedArray)
            System.out.println(str);
    }

    @Test
    public void shouldClonePorsche()
    {
        Porsche porsche = new Porsche("Jose","Blue");
        // Porsche peter = porsche.clone(); it can't be used
        // after fixing the porsche class asssign clone method
        Porsche peterPorsche = porsche.clone();
        assertNotSame(porsche, peterPorsche);

        peterPorsche.sellTo("Peter");
        System.out.println(peterPorsche.asString());
        assertEquals("Peter", peterPorsche.asString());
        assertEquals("Jose", porsche.asString());

    }

    @Test
    public void shouldPorscheEquals(){
        Porsche myPorscheJose = new Porsche("Jose","Black");
        Porsche myPorschePeter = new Porsche("Jose","Black");

        //assertTrue(myPorscheJose == myPorschePeter); //fails because two different instances here
        // assertTrue(myPorscheJose.equals(myPorschePeter)); // also different
        Porsche p3 = myPorscheJose;
        //assertTrue(p3.equals(myPorscheJose));

        assertTrue(myPorscheJose.equals(myPorschePeter));   //Equal object
        assertTrue(myPorscheJose.equals(myPorscheJose));    //Same object
        assertTrue(!myPorscheJose.equals(null));            //Object null
        BMW xyz = new BMW ();
        assertTrue(!myPorscheJose.equals(xyz));             //different class

    }

}
