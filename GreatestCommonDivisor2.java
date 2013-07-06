// Another method to compute the greatest common divisor
// Start from the smaller of n1 and n2. Then we check if d, d-1, d-2 ...
// is the divisor for both n1 and n2.

import java.util.Scanner;

public class GreatestCommonDivisor2 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for 2 integers
		System.out.print("Enter the two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		// Find the smaller between n1 and n2
		int smaller = (number1 > number2) ? number2 : number1;
		System.out.println(
				smaller + " is the smaller between " + number1 + ", " + number2);
		
		// Determine if d is the common divisor for both n1 and n2
		
		// If so, break
		
		// Otherwise, decrement d
		
		// Print the result
	}
}