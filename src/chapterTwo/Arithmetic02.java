package chapterTwo;

import java.util.Scanner;

public class Arithmetic02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer");
        int firstInt = input.nextInt();

        System.out.println("Enter second integer");
        int secondInt = input.nextInt();

        int add = firstInt + secondInt;
        int mul = firstInt * secondInt;
        int sub = firstInt - secondInt;
        int div = firstInt / secondInt;
        int mod = firstInt % secondInt;

        System.out.printf("Addition = %d%n" , add);
        System.out.printf("Multiplication = %d%n ", mul);
        System.out.printf("Subtraction = %d%n " , sub);
        System.out.printf("Division = %d%n " , div);
        System.out.printf("Modules = %d%n " , mod);



    }
}
