package tdd;

import chapterFour.kata;
import org.junit.jupiter.api.Test;
//import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class kataTest {

    @Test
    public void squareTest(){
        kata kata = new kata();

        int result = kata.squareOf(500);
        assertEquals(500, result);

    }

    @Test
    public void addTest(){
        kata kata = new kata();
        int sum = kata.addTest(15,62);
        assertEquals(77, sum);
    }

    @Test
    public void maxTest() {
        kata kata = new kata();
        int max = kata.maxOf(23,12);
        int maximum = 23;
        assertEquals(23, maximum);



    }
}