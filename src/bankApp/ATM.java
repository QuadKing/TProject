package bankApp;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Scanner;


public class ATM {
    private static final Scanner keyboardInputCollector = new Scanner(System.in);
    private static final Bank gtBank = new Bank();
    public static  void main(String[] args){
        gotoMainMenu();

    }
    private static void gotoMainMenu() {
        String mainMenu = """
                =========================
                Welcome to GTB Bank
                1 --> Create Account
                2 --> Make Deposit
                3 --> Make Withdrawal
                4 --> Make Transfer
                5 --> Check Account Balance
                6 --> Exit
                ========================
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' --> createAccount();
            case '2' --> makedeposit();
            case '3' --> MakeWithdrawal();
            case '4' --> MakeTransfer();
            case '5' --> CheckAccountBalance();
            case '6' --> Exit();
                default -> gotoMainMenu();
        }
    }

    private static void Exit(){
        display("Thank You For Banking With Us>>>");
        System.exit(1);
    }

    private static void checkBalance(){
        int accountNumber = Integer.parseInt(input("Enter Your Account Number: "));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter Your Account Number: ")));
        String pin = input("Enter Your Pin: ");
        try{
            gtBank.withdrawFrom(accountNumber, amount, pin);
        } catch (IllegalArgumentException error) {
            display(error.getMessage());
            withdraw();
        }
        display( "Withdrawal Successful");
        display("Your New Account Balance is "+ gtBank.checkBalanceFor(accountNumber, pin));
        gotoMainMenu();

    }

    private static void deposit(){
        int accountNumber = Integer.parseInt(input("Enter Your Account Number: "));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter Amount")));
        String pin = input("Enter Your Pin");
        gtBank.depositinto(accountNumber, amount);
        display("Your New Account Balance Is "+ gtBank.checkBalanceFor(accountNumber,pin));
        display("Deposit Successful");
        gotoMainMenu();
    }

    private static void createAccount(){
        String firstName = input ("Enter Your First Name: ");
        String lastName = input("Enter Your Last Name: ");
        String pin = input("Enter Your Pin: ");
        gtBank.depositinto(accountNumber, amount);
        display("Your New Account Balance Is "+ gtBank.checkBalanceFor(accountNumber, pin));
        display("Deposit Successful");
        gotoMainMenu();
    }

    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
        //display(prompt)
        //return keyboardInputCollector.nextLine();

    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
        //System.out.println(prompt);

    }

}