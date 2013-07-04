// Compute the minimum run way length needed to take off

import java.util.Scanner;

class ComputeRunwayLength {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for velocity, and acceleration
		System.out.print("Enter v and a: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		// Compute the minimum run way distance is needed
		// Formula: length = v2 / 2a
		double length = Math.pow(v, 2) / (2 * a);
		
		// Display result
		System.out.print("The minimum runway length for this airplane is ");
		System.out.print(length);
	}
}