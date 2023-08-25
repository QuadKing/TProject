package chapterThree;

import java.util.Scanner;

public class RunwayLength{

public static void main(String[] args){ 

Scanner length = new Scanner(System.in);


System.out.println("Enter speed: ");
 double v = length.nextDouble();

System.out.println("Enter acceleration: ");
   double a = length.nextDouble();

double length1 = (v * v) / ( 2 * a);

System.out.printf("The minimum runway length for this airplane is %.3f%n",length1 );
 


}


}