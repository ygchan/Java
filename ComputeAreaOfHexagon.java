// Program that compute the area of a hexagon

import java.util.Scanner;

class ComputeAreaOfHexagon {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for the side
		System.out.print("Enter the side: " );
		double side = input.nextDouble();
		
		// Compute the area
		double area = (3 * Math.pow(3, 0.5) / 2) * Math.pow(side, 2);
		
		// Display result
		System.out.print("The area of the hexagon is " + area);
	}
}