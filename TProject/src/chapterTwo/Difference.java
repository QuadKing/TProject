package chapterTwo;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer");
        int firstInt = input.nextInt();

        System.out.println("Enter second integer");
        int secondInt = input.nextInt();

        int sum = firstInt + secondInt;
        int sub = firstInt - secondInt;
        int mul = firstInt * secondInt;
        int ave = (firstInt + secondInt) / 2;
        int dis = firstInt - secondInt;
        System.out.printf("%nSum = %d%nDifference = %d%nProduct = %d%nAverage = %d%nDistance = %d%n"
        , sum,sub, mul,ave,dis);


        if (firstInt > secondInt){
            System.out.println("max = " + firstInt);
        }
        if (secondInt < firstInt) {
            System.out.println("min = " + secondInt);
        }
    }
}
