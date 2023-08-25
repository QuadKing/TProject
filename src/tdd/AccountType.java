package tdd;

public class AccountType {

    private int balance;

    public void deposit(int amount) {
        balance = amount + balance;
    }

    public int getBalance(int amount) {

        return balance;
    }
}
