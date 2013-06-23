// Compute the area of a rectangle
import java.util.Scanner;

class ComputeRectangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Obtain the user input for the length and width
		System.out.print("Enter a number for the length: ");
		double length = input.nextDouble();
		System.out.print("Enter a number for the width: ");
		double width = input.nextDouble();
		
		// Compute the area of a rectangle
		double areaOfRectangle = length * width;
		
		// Display the result of the area calutation
		System.out.print("The area of a " + length + " x " + width 
				+ "rectangle is " + areaOfRectangle);
	}
}