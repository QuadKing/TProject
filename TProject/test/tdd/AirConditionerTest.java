package tdd;

import myAc.AirConditioner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

        AirConditioner lg;

        @BeforeEach
        void startWith(){
            lg = new AirConditioner();
        }


    @Test
    void testThatAcIsOn(){
        //given
       // AirConditioner lg = new AirConditioner();
        assertFalse(lg.isOn());
        //when
       lg.turnOn();
        //Assert
        assertTrue(lg.isOn());
    }

    @Test
    public void testThatAcIsOff(){
        //AirConditioner lg = new AirConditioner();
        assertFalse(lg.isOn());
        lg.turnOn();
        assertTrue(lg.isOn());

        //when
        lg.turnOff();
        //check
        assertFalse(lg.isOn());

    }
    @Test
    void acCanIncrease(){
        //given
        //AirConditioner lg = new AirConditioner();
        assertFalse(lg.isOn());

        lg.turnOn();
        assertTrue(lg.isOn());

        assertEquals(16, lg.getTemperature());

        //when
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        assertEquals(20, lg.getTemperature());
    }
    @Test
    void acCanDecrease(){
        //given
        //AirConditioner lg = new AirConditioner();
        assertFalse(lg.isOn());

        lg.turnOn();
        assertTrue(lg.isOn());

        assertEquals(16, lg.getTemperature());
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();

        assertEquals(19, lg.getTemperature());

        //when
        lg.decreaseTemperature();
        assertEquals(18, lg.getTemperature());

    }
    @Test
    void testAcCannotIncreaseBeyond30(){
        //given
       // AirConditioner lg = new AirConditioner();
        assertFalse(lg.isOn());

        lg.turnOn();
        assertTrue(lg.isOn());

        assertEquals(16, lg.getTemperature());

        //when
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();

        assertEquals(30, lg.getTemperature());
    }

    @Test
    public void temperatureCantDecreaseBelow16(){
        //given
        //AirConditioner lg = new AirConditioner();
        assertFalse(lg.isOn());

        lg.turnOn();
        assertTrue(lg.isOn());

        assertEquals(16, lg.getTemperature());

        //when
        lg.decreaseTemperature();
        assertEquals(16, lg.getTemperature());


    }
}