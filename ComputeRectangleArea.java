// Compute the area of a rectangle
import java.util.Scanner;

class ComputeRectangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declare a constant, and they should always be in upper case
		final double WIDTH = 10; 
		
		// Obtain the user input for the length and width
		System.out.print("Enter a number for the length: ");
		double length = input.nextDouble();
		// System.out.print("Enter a number for the width: ");
		// double width = input.nextDouble();
		
		// Compute the area of a rectangle
		double areaOfRectangle = length * WIDTH;
		
		// Display the result of the area calculation
		System.out.print("The area of a " + length + " x " + WIDTH 
				+ "rectangle is " + areaOfRectangle);
	}
}