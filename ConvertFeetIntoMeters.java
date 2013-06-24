// Write a program that reads a number in feet, converts it to meter,
// and display the result. One foot is 0.305 meter.
import java.util.Scanner;

class ConvertFeetIntoMeters{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		
		double feet = input.nextDouble();
		double meters = feet * 0.305;
		// Format it to two decimal place
		meters = (int)(meters * 100) / 100.0;
		
		System.out.print(feet + " feet is " + meters + " meteres");
	}
}