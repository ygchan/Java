// Compute the distance of two points

import java.util.Scanner;

class DistanceOfTwoPoints{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Prompt the user to enter (x1, y1)
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		// Prompt the user to enter (x2, y2)
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Compute the distance between the two point
		double distance = Math.pow(Math.pow(x2-x1, 2) 
				+ Math.pow(y2-y1, 2), 0.5);
		
		// Display the answer
		System.out.print("The distance of two points is " + distance);
	}
}