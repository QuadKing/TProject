package chapterThree;

import java.util.Scanner;

public class Minutes {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter numbers in minutes: ");
long min = input.nextLong();

long years = (long) (min/(60*24*365));
long days = (long) (min/60/24)%365;

System.out.println( min +  " is approximately "  +  years  +  " years and "  +  days  +  " days ");

}



}













