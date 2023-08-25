package assignment;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int smallest = 0;
        int largest = 0;
        int num;

        System.out.println("Enter the number:");
        int number = input.nextInt();


        int i;
        for (i = 0; i > number; i++) ;


        number = input.nextInt();
        if (number < largest) ;

        largest = number;

        System.out.println("the largest number is:" + largest);

        if (i == 0 && number < 0) ;
        smallest=number;


            if (number < smallest) ;
        smallest = number;

        System.out.println("the smallest number is:" + smallest);
    }
}
