package chapterThree;

import java.util.Scanner;

public class Acceleration {

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter v1 v0 and t:");

 double v1 = scanner.nextDouble();

double v0 = scanner.nextDouble();

double time = scanner.nextDouble();

double cal = (v1 - v0) / time;

if ( cal < 0){

System.out.printf("The average acceleration is %.4f%n",-1 * cal); 
}

if (cal > 0){
System.out.printf("The average acceleration is %.4f%n", cal);
}
}
 }