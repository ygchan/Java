// A program that prompt user for a point and check if it is in the triangle

import java.util.Scanner;

public class PointInTriangle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input for point
		System.out.print("Enter a point's x and y coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// Compute the Slope the the triangle
		// Formula: rise over run, (y2 - y1) = (x2 - x1)
		double slope = (0.0 - 100.0) / (200.0 - 0.0);
		
		// Equation of a line: y = mx + b
		double triangleY = x * slope + 100;
		double triangleX = (y - 100) / slope;
		
		// Testing print statement
		// System.out.print(slope);
		
		// Determine if the point is in the triangle
		if (x <= triangleX && y <= triangleY) 
			System.out.print("The point is in the triangle");
		else 
			System.out.print("The point is not in the triangle");
	}
}