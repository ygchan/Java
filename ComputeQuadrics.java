// A program that prompt user to input values for a, b, and c.
// Display the result based on the discriminant

import java.util.Scanner;

public class ComputeQuadrics {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input a, b, c
		System.out.print("Enter a, b, c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Compute the discriminant
		// Formula: b^2 - 4ac
		double discriminant = Math.pow((Math.pow(b, 2) - (4 * a * c)), 0.5);
		
		// If discriminant is positive
		if (discriminant > 0) {
			// Display two real roots
			double r1 = (-(b) + discriminant) / (2 * a);
			double r2 = (-(b) - discriminant) / (2 * a);
			System.out.print("The roots are " + r1 + " and " + r2);
		}
		
		// If discriminant is equal to 0
		else if (discriminant == 0) {
			// Display one root
			double r1 = (-(b) + discriminant) / (2 * a);
			System.out.print("The roots are " + r1);
		}
		
		// Else display no root message
		else
			System.out.println("The equation has no real roots");
		
	}
}