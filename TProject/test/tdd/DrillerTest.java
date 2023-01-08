package tdd;

import org.junit.jupiter.api.Test;
import tdd.Driller;

import static org.junit.jupiter.api.Assertions.*;

public class DrillerTest {

    @Test
    public void firstCopyTest(){
        Driller driller  = new Driller();
        int copies = driller.amount(4);
        assertEquals(6000, driller.amount(3));

    }

    @Test
    public void secondCopyTest(){
        Driller driller  = new Driller();
        int copies = driller.amount(6);
        assertEquals(9000, driller.amount(5));
    }

    @Test
    public void thirdCopyTest(){
        Driller driller  = new Driller();
        int copies = driller.amount(23);
        assertEquals(16000, driller.amount(10));
    }

    @Test
    public void fourthCopyTest(){
        Driller driller  = new Driller();
        int copies = driller.amount(43);
        assertEquals(45000, driller.amount(30));
    }

    @Test
    public void fifthCopyTest(){
        Driller driller  = new Driller();
        int copies = driller.amount(80);
        assertEquals(65000, driller.amount(50));
    }

    @Test
    public void sixthCopyTest() {
        Driller driller = new Driller();
        int copies = driller.amount(120);
        assertEquals(120000, driller.amount(100));
    }

    @Test
    public void seventhCopyTest(){
        Driller driller = new Driller();
        int copies = driller.amount(300);
        assertEquals(220000, driller.amount(200));
    }

    @Test
    public void eightCopyTest(){
        Driller driller = new Driller();
        int copies = driller.amount(500);
        assertEquals(500000, driller.amount(500));
    }

}


