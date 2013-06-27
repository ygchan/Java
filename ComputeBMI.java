// A simple program that compute the Body Mass Index

import java.util.Scanner;

class ComputeBMI {
	public static void main(String[] args) {
		// Prompt user to input the weight
		System.out.print("Enter weight in pounds: ");
		Scanner input = new Scanner(System.in);
		double weightInPounds = input.nextDouble();
		
		// Convert the weight from pounds to kilogram
		double weightInKilograms = weightInPounds * 0.4535;
		
		// Prompt user to input the height
		System.out.print("Enter height in inches: ");
		double heightInInches = input.nextDouble();
		
		// Convert the height from inches to meters
		double heightInMeters = heightInInches * 0.0254;
		
		// Compute the Body Mass Index
		// Formula: (weight) kg / (height) m^2
		double BMI = weightInKilograms / Math.pow(heightInMeters, 2.0);
			
		System.out.println("BMI is " + BMI);
	}
}