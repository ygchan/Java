// Implement the Zeller's congruence algorithm.
// Formula: h = (q + floor(26(m+1)/10 + k + floor(k/4) + floor(j/4) + 5j) % 7
// To calculate the day of the week

import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a year, month and a day
		System.out.print("Enter year (e.g., 2008): ");
		int year = input.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();
		
		// Check if the month is January or February
		// If the month is January and February, convert to 13, and 14,
		// and year has to -1. (Go to previous year).
		if (month == 1 || month == 2) {
			month += 12;
			year--;
		}
		
		// Compute the answer
		int k = year % 7; // The year of the century
		int j = (int)(year / 100.0); // the century
		int q = day;
		int m = month;
		int h = (q + (int)((26 * (m + 1)) / 10.0) + k + (int)(k / 4.0) 
				+ (int)(j / 4.0) + (5 * j)) % 7;
		
		System.out.println("Test: " + year + ", " + month + ", " + day);
		System.out.print(h);
		
		String result = "Day of the week is ";
		
		//Display the name of the day of the week
		if (h == 0) 
			System.out.print(result + "Saturday");
		else if (h == 1)
			System.out.print(result + "Sunday");
		else if (h == 2)
			System.out.print(result + "Monday");
		else if (h == 3)
			System.out.print(result + "Tuesday");
		else if (h == 4)
			System.out.print(result + "Wednesday");
		else if (h == 5)
			System.out.print(result + "Thursday");
		else
			System.out.print(result + "Friday");
	}
}