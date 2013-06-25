// Write a program that reads an integer between 0 and 1000 and
// adds all the digits in the integer. Ex: 932, the sum of all its digit is 14.

import java.util.Scanner;

class SummingTheDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		// Use the % operator to extract digits, and use the / operator to
		// remove the extracted digit.
		int digit1 = number % 10;
		number = number / 10;
		
		int digit2 = number % 10;
		number = number / 10;
		
		int digit3 = number;
		int sum = digit1 + digit2 + digit3;
		System.out.print("The sum of the digits is " + sum);
	}
}