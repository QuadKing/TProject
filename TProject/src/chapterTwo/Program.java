package chapterTwo;

import java.util.Scanner;
public class Program {
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first integer");
		int firstInt = input.nextInt();

		System.out.println("Enter second integer");
		int secondInt = input.nextInt();

		System.out.println("Enter third integer");
		int thirdInt = input.nextInt();

		System.out.println("Enter fourth integer");
		int fourthInt = input.nextInt();

		if ((firstInt != secondInt) && (thirdInt != fourthInt)) {System.out.println("Numbers are not equal");}
		

	}


}