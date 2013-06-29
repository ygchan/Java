// A simple program that compute the Body Mass Index

import java.util.Scanner;

class ComputeBMI {
	public static void main(String[] args) {
		// Prompt user to input the weight
		System.out.print("Enter weight in pounds: ");
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		
		// Prompt user to input the height
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		// Compute BMI
		double weightInKilgrams = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilgrams / Math.pow(heightInMeters, 2);
		
		// Display result
		System.out.printf("Your BMI is %5.2f\n", bmi);
		if (bmi < 16)
			System.out.println("You are seriously underweight");
		else if (bmi < 18)
			System.out.println("You are underweight");
		else if (bmi < 24)
			System.out.println("You are normal weight");
		else if (bmi < 29)
			System.out.println("You are over weight");
		else if (bmi < 35)
			System.out.println("You are seriously overweight");
		else
			System.out.println("You are gravely overweight");
	}
}