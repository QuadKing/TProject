package tdd;

public class Account {

    private  String setPin = "1234";

    private int balance;
    private String name;

    public void deposit(int amount) {
        if(amount>0) {
            balance = balance + amount;
        }
    }
    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, String setpin) {
        balance = balance - amount;
    }

    public void createNewAccount(String Name, String PhoneNumber, String Pin, int amount) {
    }

    private String setPin() {
        return null;
    }

    private String setPhoneNumber() {
        return null;
    }

    private String setName() {
        return null;
    }

}

