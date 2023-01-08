package chapterThree;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first input");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.printf("%s is an EVEN Number", number);
        }
        else {
            System.out.printf("%s is an ODD Number", number );
        }
    }
}
