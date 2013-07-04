// A program that prompts the user to enter two positive integers and
// find their greatest common divisor.

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers
		System.out.print("1 Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("2 Enter second integer: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		int k = 2;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
			k++;
			
		}
		
		System.out.println("The greatest common divisor for " + n1 + 
				" and " + n2 + " is " + gcd);
	}
}