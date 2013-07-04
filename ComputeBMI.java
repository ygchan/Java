// A simple program that compute the Body Mass Index

import javax.swing.JOptionPane;

class ComputeBMI {
	public static void main(String[] args) {
		// Prompt user to input the weight
		String weightString = JOptionPane.showInputDialog(
				"Enter weight in pounds:");
		double weight = Double.parseDouble(weightString);
		
		// Prompt user to input the height
		String feetString = JOptionPane.showInputDialog(
				"Enter height (feet part): ");
		String inchString = JOptionPane.showInputDialog(
				"Enter height (inch part): ");
		
		double feet = Double.parseDouble(feetString);
		double inch = Double.parseDouble(inchString);
		double height = feet * 12 + inch;
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		// Compute BMI
		double weightInKilgrams = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilgrams / Math.pow(heightInMeters, 2);
		
		String result;
		
		// Display result
		System.out.printf("Your BMI is %5.2f\n", bmi);
		if (bmi < 16)
			result = "You are seriously underweight";
		else if (bmi < 18)
			result = "You are underweight";
		else if (bmi < 24)
			result = "You are normal weight";
		else if (bmi < 29)
			result = "You are over weight";
		else if (bmi < 35)
			result = "You are seriously overweight";
		else
			result = "You are gravely overweight";
		
		JOptionPane.showMessageDialog(null, result);
	}
}