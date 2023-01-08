package chapterThree;

import java.util.Scanner;

public class Energy {

public static void main(String[] args){

Scanner en = new Scanner(System.in);
 
System.out.print("Enter the amount of water in kilogram: ");
double m = en.nextDouble();

System.out.print("Enter the initial tempareture: ");
double temp = en.nextDouble();

System.out.print("Enter the final tempareture: ");
double fin = en.nextDouble();

double q = m * (temp - fin) * 4184;
if ( q < 0){
System.out.printf("The energy is %.1f%n ", -1 * q);
}
else {
System.out.printf("The energy is %.1f%n ", q); }

}




}