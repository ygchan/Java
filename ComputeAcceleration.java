// Program that compute the average acceleration

import java.util.Scanner;

class ComputeAcceleration {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the starting velocity, ending velocity and time
		System.out.print("Enter v0, v1, and t : ");
		
		// Get the input from Scanner and assign it to the variable
		double v0 = input.nextDouble(); // starting velocity
		double v1 = input.nextDouble(); // ending velocity
		double t = input.nextDouble(); // time span
		
		// Compute the average velocity
		// Formula: a = (v1 - v0) / t 
		double averageAcceleration = (v1 - v0) / t;
		
		// Display the result
		System.out.print("The average acceleration is " + averageAcceleration);
	}
}