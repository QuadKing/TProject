package tdd;

public class MyAccount {


    private int balance;

    public void deposit(int amount) {
        if (amount > 0){
            balance = balance + amount;
        }
    }


    public int getBalance(int amount) {

        return balance;
    }

    public int withdraw(int amount) {
        return balance = balance - amount;
    }
}
