// A program that calculate the energy needed to heat water from
// initial temperature to a final temperature

import java.util.Scanner;

class ComputeEnergy {
	public static void main(String[] args) {
		// Prompt user for amount of water
		System.out.print("Enter the amount of water in kilograms: ");
		Scanner input = new Scanner(System.in);
		// Amount of water in kilogram
		double amountOfWater = input.nextDouble();
		
		// Prompt user for initial temperature
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		// Prompt user for final temperature
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		// Compute the energy (Joules)
		// Formula: Q = M * (FT - IT) * 4184
		float energy = (float) (amountOfWater * 
				(finalTemperature - initialTemperature) * 4184);
		
		System.out.print("The energy needed is: " + energy);
	}
}