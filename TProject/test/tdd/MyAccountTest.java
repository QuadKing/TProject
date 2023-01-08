package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAccountTest {
    MyAccount jacob;

    @BeforeEach
    void setUp() {
        jacob = new MyAccount();
    }

    @Test
    void  depositTest(){
       // MyAccount jacob = new MyAccount();

        jacob.deposit(-10_000);

        int amt = jacob.getBalance(0);
        assertEquals(0, amt);


        jacob.deposit(200);
        assertEquals(200, jacob.getBalance(200));

    }

    @Test
    void Withdraw(){
    //MyAccount jacob = new MyAccount();

    jacob.deposit(2_000);
    jacob.withdraw(1500);
    assertEquals(500, jacob.getBalance(500));
    }


}

