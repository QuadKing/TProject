//package bankApp;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AccountSysTest {
//    private Account mine;
//
//    @BeforeEach
//    public void startWithThis(){
//
//        mine = new Account("1234");
//    }
//
//    @Test
//    public void depositMoneyTest(){
//        mine.deposit(BigDecimal.valueOf(2_000));
//        assertEquals(BigDecimal.valueOf(2_000), mine.getBalance("1234"));
//    }
//
//    @Test
//    public void getBalanceWithCorrectPinTest(){
//        mine.deposit(BigDecimal.valueOf(2_000));
//        assertEquals(BigDecimal.valueOf(2_000), mine.getBalance("1234"));
//    }
//
//    @Test
//    public void pinThrowsIllegalExceptionTest(){
//        mine.deposit(BigDecimal.valueOf(2_000));
//        assertThrows(IllegalArgumentException.class,()-> mine.getBalance("1234"));
//    }
//
//    @Test
//    public void withdrawMoneyTest(){
//        mine.deposit(BigDecimal.valueOf(2_000));
//        mine.withdraw(BigDecimal.valueOf(500));
//        assertEquals(BigDecimal.val);
//    }
//
//}