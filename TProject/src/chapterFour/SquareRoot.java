package chapterFour;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Enter first numbers : ");
        int input1 = num.nextInt();
        System.out.println("Enter second number : ");
        int input2 = num.nextInt();

        int result = 1;
        for (int i = 0; i < input2; i++) {
            result *= input1;
        }
            System.out.println(result);

        }
    }