package bankApp;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    ArrayList<Account>accounts = new ArrayList<>();


    public void createAccount(String firstName, String lastName, String Pin){
        int acoountNuber = accounts.size()+1;
        Account bankAccount = new Account(1,firstName+" "+lastName, Pin);
        accounts.add(bankAccount);

    }

    public int getNumberofCustomers(){
        return accounts.size();

    }
    public Account findAccount(int accountNumber){
        return accounts.get(accountNumber-1);
    }

    public BigDecimal checkBalanceFor(int accountNumber, String pin){
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
    }

    public void depositinto(int accountNumber, BigDecimal amount){
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdrawFrom(int accountNumber, BigDecimal amount, String pin){
        findAccount(accountNumber).withdraw(amount, pin);
    }

    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String sendersPin){
        Account sendrAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        try{
            senderAccount.withdraw(amount, sendersPin);
        }
        catch (Exception error){
            throw new IllegalArgumentException("Invalid pin");
        }
        receiverAccount.deposit(amount);
    }


}