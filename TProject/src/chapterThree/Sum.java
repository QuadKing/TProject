package chapterThree;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input first number");
        int firstNumber = input.nextInt();

        System.out.println("input second number");
        int secondNumber = input.nextInt();

        int add = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.printf("Addition = %d%n" , add);
        System.out.printf("Multiplication = %d%n ", mul);
        System.out.printf("Subtraction = %d%n " , sub);
        System.out.printf("Division = %d%n " , div);
        System.out.printf("Modules = %d%n " , mod);
    }
}
