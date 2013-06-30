// A program that reads the edges and determine the input is valid

import java.util.Scanner;

public class ValidateTriangle {
	public static void main(String[] args) {
		// Prompt the user for input
		System.out.print("Enter three edges: ");
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		
		// Sum of the edges
		double sum1 = edge1 + edge2;
		double sum2 = edge2 + edge3;
		double sum3 = edge3 + edge1;
		
		// Testing if any of the two edges be greater than the third one
		boolean test1 = (sum1 > edge3);
		boolean test2 = (sum2 > edge1);
		boolean test3 = (sum3 > edge2);
		
		boolean isValid = (test1 && test2 && test3);
		
		if (isValid)
			System.out.print("Can edge " + edge1 + " " + edge2 + " and " +
				edge3 + " form a triangle? " + isValid);
		else
			System.out.print("Can edge" + edge1 + " " + edge2 + " and " +
					edge3 + " form a triangle? " + isValid);
		
	}
}