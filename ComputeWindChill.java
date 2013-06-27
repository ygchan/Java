// A program that compute the wind chill temperature

import java.util.Scanner;

class ComputeWindChill {
	public static void main(String[] args) {
		System.out.print("Enter the temperature in Fahrenheit: ");
		Scanner input = new Scanner(System.in);
		
		// Temperature is measured in Fahrenheit in this program
		double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed miles per hour: ");
		double windSpeedPreHour = input.nextDouble();
		
		// Compute the wind chill effect index
		double windChillIndex =35.74 + 0.6215 * (temperature) 
				- 35.75 * (Math.pow(windSpeedPreHour, 0.16))
				+ 0.4275 * (temperature) * Math.pow(windSpeedPreHour, 0.16);
		
		System.out.print("The wind chill index is: " + windChillIndex);
	}
}