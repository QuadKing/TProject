package chapterTwo;

import java.util.Scanner;
	public class Palindrome{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input");
		int number = input.nextInt();

		int digit1 = number / 100 % 10;
		int digit2 = number / 10 % 10;
		int digit3 = number % 10;

	if (digit1 == digit3){
				System.out.println("number is a palindrome");
			}
	else System.out.println("number is not a palindrome");









		}


}