// A program that prompts user to enter the two rectangle and
// determine if they overlap each other.

public class TwoRectangles {
	public static void main(String[] args) {
		// Prompt user to enter the coordinates of two rectangles
		double r1cx = 2.5; // rectangle 1's center x coordinate
		double r1cy = 4; // rectangle 1's center y coordinate
		double r1width = 2.5; // rectangle 1's width
		double r1height = 43; // rectangle 1's height
		
		double r2cx = 1.5;
		double r2cy = 5;
		double r2width = 0.5;
		double r2height = 3;
		
		// Determine if it is inside
		boolean isInside = 
			((r1x1 <= r2x1) && (r1x2 >= r2x2) && 
			(r1y1 >= r2y1) && (r1y2 <= r2y2));
		
		// Determine if it is overlap
		boolean isOverLap = 
				((r1x1 <= r2x1) || (r1x2 >= r2x2) || 
				(r1y1 >= r2y1) || (r1y2 <= r2y2));

		// Determine if it is not overlap
		boolean isNotOverLap = !(isOverLap);
		
		// Display result
	}
}