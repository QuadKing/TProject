package chapterThree;

import java.util.Scanner;
  
//import java.lang.Math;

public class Triangle{

public static void main(String[] args) {

Scanner geometry = new Scanner(System.in);

System.out.print("Enter three points for a triangle : ");

float side1 = geometry.nextFloat();
 float side2 = geometry.nextFloat();
     float side3 = geometry.nextFloat();
      float side4 = geometry.nextFloat();
       float side5 = geometry.nextFloat();
         float side6 = geometry.nextFloat();
         


double sideSum1 = ( side1 - side2);

double sideSum2 = (side3 - side4);

double sideSum3 = (side5 - side6);

double value = (sideSum1) + (sideSum2) + (sideSum3) / 2;

 double area1 = value * (value - sideSum1) * (value -sideSum2) * (value - sideSum3);
 double n=Math.sqrt(area1);
System.out.printf("The area of the triangle is %d%n", n);

}


}