package chapterFour;

import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter a number");
        double num1 = number.nextDouble();
        double counter = 1;
        double sum = 0;

       while (counter < num1){
           sum += (1/counter);
           counter += 1;
       }
           System.out.println(sum);



    }
}
