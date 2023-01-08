package chapterFour;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1. 2000
                2. 5000 
                3. 15000
                4. 20000
                5. 25000
                6. 30000
                """);

        System.out.println("Enter amount you want to withdraw :");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                System.out.println("take your 2k");
                break;
            case 2:
                System.out.println("take your 5k");
                break;
            case 3:
                System.out.println("take your 15k");
                break;
            case 4:
                System.out.println("take your 20k");
                break;
            case 5:
                System.out.println("take your 25k");
                break;
            case 6:
                System.out.println("take your 30k");
                String amount = scanner.nextLine();

                otherOption(amount);

        }

    }

    private static void otherOption(String amount) {
        System.out.println("take your" + amount+"k");
    }

    }
