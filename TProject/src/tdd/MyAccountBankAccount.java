package tdd;

public class MyAccountBankAccount {

    private int balance;

    public void deposit(int amount) {
         balance = amount + balance;
    }

    public int getBalance(int amount) {

        return amount;
    }

    public int withDraw(int amount) {
        return balance = balance - amount;

    }

    public int withDrawNgetive(int amount) {
        if (amount > 0);
        return balance = amount - balance;
    }
}
