//package bankApp;
//
//import java.math.BigDecimal;
//
//public class AccountSys {
//    private BigDecimal balance = BigDecimal.ZERO;
//    private String pin;
//
//    public Account(String accountPin){
//        pin = accountPin;
//    }
//
//    public void deposit(BigDecimal amount) {
//
//        balance = balance.add(amount);
//    }
//
//    public BigDecimal getBalance(String pin) {
//        if(!pin.equals(this.pin)) throw new IllegalArgumentException("Invalid Pin");
//        return balance;
//    }
//
//    public void withdraw(BigDecimal amount){
//        if (amount.compareTo(balance) < 0)
//            balance = balance.subtract(amount);
//    }
//}
