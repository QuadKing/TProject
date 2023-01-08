//package tdd;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AcTest {
//
//    @Test
//    public void checkThatAcIsOn(){
//        //given
//        Ac sony = new Ac();
//        assertFalse(sony.isOn());
//        //when
//        sony.turnOn();
//        //Assert
//        assertTrue(sony.isOn());
//    }
//
//    @Test
//    public void checkThatAcIsOff(){
//        //given
//        Ac sony = new Ac();
//        assertFalse(sony.isOn());
//        sony.turnOn();
//        assertTrue(sony.isOn());
//        //when
//        sony.turnoff();
//        //check
//        assertFalse(sony.isOn());
//    }
//
//    @Test
//    public void increaseTemperature(){
//        //given
//        Ac sony = new Ac();
//        assertFalse(sony.isOn());
//
//        sony.turnOn();
//        assertTrue(sony.isOn());
//
//        assertEquals(16, sony.getTemperature);
//
//        //when
//        sony.increaseTemperature();
//        sony.increaseTemperature();
//        sony.increaseTemperature();
//        sony.increaseTemperature();
//        sony.increaseTemperature();
//        sony.increaseTemperature();
//        sony.increaseTemperature();
//        sony.increaseTemperature();
//        sony.increaseTemperature();
//        assertEquals(25, sony.getTemperature());
//    }
//
//    @Test
//    public void decreaseTemperature(){
//        //given
//        Ac sony = new Ac();
//        assertFalse(sony.isOn());
//
//        sony.turnOn();
//        assertTrue(sony.isOn());
//
//        assertEquals(16, sony.getTemperature());
//    }
//}
//
