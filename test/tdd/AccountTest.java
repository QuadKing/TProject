//package tdd;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import javax.naming.Name;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AccountTest {
//
//    Account sundayAccount;
//
//    @BeforeEach
//    void setUp() {
//        sundayAccount = new Account();
//    }
//
//    @Test
//    public void depositTest(){
//        //given
//       // Account sundayAccount = new Account();
//
//        //when i deposit 5000
//        sundayAccount.deposit(5000);
//
//        //check that balance is 5000
//        int sundayAccountBalance = sundayAccount.getBalance();
//        assertEquals(5000, sundayAccountBalance);
//
//    }
//    @Test
//    public void depositTwiceTest(){
//        //given there an account
//        //Account sundayAccount = new Account();
//
//        //given that initial balance is 4000
//        sundayAccount.deposit(4000);
//
//        //when i deposit 2000
//        sundayAccount.deposit(2000);
//
//        //check that balance is 6000
//        int sundayAccountBalance = sundayAccount.getBalance();
//        assertEquals(6000, sundayAccountBalance);
//    }
//
//    @Test
//    public void depositNegativeAmountTest() {
//        //given there an account
//        //Account sundayAccount = new Account();
//
//        //given that initial balance is 4000
//        sundayAccount.deposit(-4000);
//
//        //when i deposit 2000
//        sundayAccount.deposit(-2000);
//
//        //check that balance is 6000
//        int sundayAccountBalance = sundayAccount.getBalance();
//        assertEquals(0, sundayAccountBalance);
//    }
//
//    @Test
//    public void withDrawAccountTest(){
//        //given there an account
//        //Account sundayAccount = new Account();
//
//        //given that initial balance is 4000
//        sundayAccount.deposit(4000);
//
//        //when i deposit 2000
//        sundayAccount.withdraw(2000,"1234");
//
//        //check that balance is 2000
//        int sundayAccountBalance = sundayAccount.getBalance();
//        assertEquals(2000, sundayAccountBalance);
//    }
//
//        @Test
//    public void withdrawWithPin(){
//        //give there an account
//            // Account sundayAccount = new Account();
//            sundayAccount.deposit(20_000);
//            //when
//            sundayAccount.withdraw(15_000, "1234");
//
//            //check
//            assertEquals(5000, sundayAccount.getBalance());
//
//        }
////
////        @Test
////        void newCreation(){
////            Account sundayAccount.sundayAccount.createNewAccount();
////        //int sundayAccountBalance = sundayAccount.setAmount();
////
////
////        }
////}