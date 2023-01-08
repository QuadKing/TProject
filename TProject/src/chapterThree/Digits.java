package chapterThree;

import java.util.Scanner;

public class Digits {

public static void main(String[] args){

Scanner digits = new Scanner(System.in);

System.out.print("ENTER FIVE digits: ");

int number = digits.nextInt();

int firstDigit = number / 10_000;

int second = number / 1000 % 10;

int third = number / 100 % 10;

int fourth = number / 10 % 10;

int fifth = number / 1 % 10;

System.out.printf("%d  %d  %d  %d  %d%n", firstDigit, second, third, fourth,fifth);

}




}