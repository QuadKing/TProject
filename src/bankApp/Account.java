package bankApp;
import java.math.BigDecimal;

public class Account {

    private final int accountNumber;
    private final String accountName;
    private BigDecimal balance = BigDecimal.ZERO;
    private String pin;

    public Account(int AccountNumber, String AccountName, String accountPin){
        pin = accountPin;
        this.accontName = AccountName;
        this.accountNumber = AccountNumber;
    }

    public void deposit(BigDecimal amount){
        balance = banace.add(amount);
    }
    public void withdraw(BigDecimal amount, String pin){
        if (!pin.equals(this.pin)) throw new IllegalArgumentException("Invalid pin");
        if( amount.compareTo(balance) < 0) throw new IllegalArgumentException("Insufficient Funds");
        balance = balance.subtract(amount);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    @Override
    public String toString(){
        return String.format("""
               ========================
               Account Name: %s
               Account Number: %s
               Account Balance: %s
               =========================""", accountName, accountNumber, balance.toPlainString());
    }
}