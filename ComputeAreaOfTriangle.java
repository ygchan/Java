// A program that prompts the user to enter three points 
// (x1, y1), (x2, y2), and (x3, y3) of a triangle and displays its area

import java.util.Scanner;

class ComputeAreaOfTriangle {
	public static void main(String[] args) {
		// Create the Scanner object named input
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the three points of a triangle
		System.out.print("Enter three points for a triangle: ");
		
		// Get the input into corresponding variable
		double x1, x2, x3, y1, y2, y3;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		// Compute the area 
		double side1 = Math.pow(
				(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)), 0.5);
		double side2 = Math.pow(
				(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2)), 0.5);
		double side3 = Math.pow(
				(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2)), 0.5);
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(
				s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		// Display the result
		System.out.println("The area of a triangle is " + area);
		
	}
}