// A program that compute the wind chill temperature

import java.util.Scanner;

class ComputeWindChill {
	public static void main(String[] args) {
		System.out.print("Enter the temperature in Fahrenheit: ");
		Scanner input = new Scanner(System.in);
		
		// Temperature is measured in Fahrenheit in this program
		double temperature = input.nextDouble();
		// The temperature can not be below -58F, or above 41F
		boolean isGoodTemperature = (temperature >= -58 && temperature <= 41);
		
		
		System.out.print("Enter the wind speed miles per hour: ");
		double windSpeedPreHour = input.nextDouble();
		// The wind speed can not be below 2mph
		boolean isGoodWindSpeed = (windSpeedPreHour >= 2);
		
		
		if (isGoodTemperature && isGoodWindSpeed) {
			// Compute the wind chill effect index
			double windChillIndex =35.74 + 0.6215 * (temperature) 
					- 35.75 * (Math.pow(windSpeedPreHour, 0.16))
					+ 0.4275 * (temperature) * Math.pow(windSpeedPreHour, 0.16);
			
			// Format it to only 5 decimal place
			windChillIndex = (int)(windChillIndex * 100000) / 100000.0;
			
			System.out.print("The wind chill index is: " + windChillIndex);
		}
		else {
			System.out.println(
				"Error: The wind speed must be greater than or equal to 2, ");
			System.out.println(
				"and the temperature must be above -58F or below 41F.");
			System.exit(0);
		}
	}
}