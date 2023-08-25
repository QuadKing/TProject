package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class bonusTest {

    @Test
    public void noBonusTest(){

        Bonus increase = new Bonus();
        int bonus = increase.amount(49);
        assertEquals (0, bonus);
    }

    @Test
    public void fiftyAndAboveTest(){

        Bonus increase = new Bonus();
        int bonus  = increase.amount(50);
        assertEquals (10_000, bonus);
    }

    @Test
    public void sixtyAndAboveTest(){
        Bonus increase = new Bonus();
        int bonus = increase.amount(60);
        assertEquals (15_000, bonus);
    }

    @Test
    public void  seventyAndAbove(){

        Bonus increase = new Bonus();
        int bonus = increase.amount(500);
        assertEquals (35_000, bonus);
    }
}
