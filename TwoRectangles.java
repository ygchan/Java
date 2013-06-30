// A program that prompts user to enter the two rectangle and
// determine if they overlap each other.

import java.util.Scanner;

public class TwoRectangles {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the coordinates of two rectangles
		System.out.println(
				"Enter the r1's center x, y coordinates, width and height");
		double r1cx = input.nextDouble(); // rectangle 1's center x coordinate
		double r1cy = input.nextDouble(); // rectangle 1's center y coordinate
		double r1width = input.nextDouble(); // rectangle 1's width
		double r1height = input.nextDouble(); // rectangle 1's height

		System.out.println(
				"Enter the r2's center x, y coordinates, width and height");
		double r2cx = input.nextDouble();
		double r2cy = input.nextDouble();
		double r2width = input.nextDouble();
		double r2height = input.nextDouble();

		// Compute the 4 corners's coordinates for the rectangle
		double r1x1 = r1cx - (r1width / 2.0);
		double r1x2 = r1cx + (r1width / 2.0);
		double r1y1 = r1cy + (r1height / 2.0);
		double r1y2 = r1cy - (r1height / 2.0);

		double r2x1 = r2cx - (r2width / 2.0);
		double r2x2 = r2cx + (r2width / 2.0);
		double r2y1 = r2cy + (r2height / 2.0);
		double r2y2 = r2cy - (r2height / 2.0);
		
		// Testing the rectangle coordinates
		System.out.printf(
			"Rectangle 1: (%2.2f, %2.2f), (%2.2f, %2.2f)",
			r1x1, r1y1, r1x2, r1y2);
		System.out.printf(
			"\nRectangle 2: (%2.2f, %2.2f), (%2.2f, %2.2f)\n",
			r2x1, r2y1, r2x2, r2y2)

		// Determine if it is inside
		boolean isInside = ((r1x1 <= r2x1) && 
			(r1x2 >= r2x2) && (r1y1 >= r2y1) && (r1y2 <= r2y2));

		// Determine if it is overlap
		boolean isOverLap = ((r1x1 <= r2x1) || 
			(r1x2 >= r2x2) || (r1y1 >= r2y1) || (r1y2 <= r2y2));

		// Display result
		if (isInside) 
			System.out.print("r2 is inside r1");
		else if (isOverLap)
			System.out.print("r2 overlap r1");
		else
			System.out.print("r2 does not overlap r1");
	}
}