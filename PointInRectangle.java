// Prompt the user to enter a point and check if it is in the rectangle

import java.util.Scanner;

public class PointInRectangle{
	public static void main(String[] args) {
		// Create a Scanner;
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input the point
		System.out.print("Enter a point with two coordinaters: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double verticalDistance = x;
		double horizontalDistance = y;
		
		String result = "Point (" + x +", " + y + ") is ";
		
		if (verticalDistance <= 5 && horizontalDistance <= 2.5) 
			System.out.println(result + "in the rectangle");
		else 
			System.out.println(result + "not in the rectangle");
	}
}