// Prompt the user to enter a point and check if it is in the circle

import java.util.Scanner;

public class PointInCircle{
	public static void main(String[] args) {
		// Create a Scanner;
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input the point
		System.out.print("Enter a point with two coordinaters: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double distance = Math.pow(
				(Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
		
		String result = "Point (" + x +", " + y + ") is ";
		
		if (distance <= 10) 
			System.out.println(result + "in the circle");
		else 
			System.out.println(result + "not in the circle");
	}
}