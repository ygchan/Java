import java.util.Scanner;

public class ComputeLinearEquation {
	public static void main(String[] args){
		// Prompt user for input
		System.out.print("Enter a, b, c, d, e, f: ");
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double base = (a * d - b * c);
		if (base == 0) 
			// Display error message
			System.out.println("The equation has no solution");
		else {
			// Compute x and y
			double x = (e * d - b * f) / base;
			double y = (a * f - e * c) / base;
			// Practice how to use printf() method
			System.out.printf("x is %1.1f and y is %1.1f", x, y);
		}		
	}
}