package chapterThree;

import java.util.Scanner;

public class Converter {

public static void main(String[] args){

Scanner convert = new Scanner(System.in);

System.out.print("Enter value for feet: ");

float value = convert.nextFloat();

float conve = (float)value * 0.305f;

System.out.printf("%f feet is %f%n meters", value, conve);

}


}
