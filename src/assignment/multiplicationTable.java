package assignment;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();
        for (int i = 1; i <= 12; ++i)
        {
            System.out.printf("%d * %d = %d \n", num,i, num * i);
        }
    }
}
