package assignment;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = input.nextInt();

        int largest = number;
        int smallest = number;


        while (number != 0) {
            System.out.println("Enter a number");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
            if (number < smallest) ;
            smallest = number;
        }


                System.out.println("the largest number is :" +largest);
                System.out.println("the smallest number is :" + smallest);


            }

        }


