// Write a program that prompts the user to enter the minutes (eg. 1 billion)
// and displays the number of years and days for the minutes

import java.util.Scanner;

class FindingTheNumberOfYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int numberOfMinutes = input.nextInt();
		int oneDayInMinutes = 60 * 12;
		int oneYearInMinutes = oneDayInMinutes * 365;
		
		// Using the % (remainder operator) to get the quotient
		int numberOfYear = numberOfMinutes % oneYearInMinutes;
		// Using the / (division operator) to get the remainder
		int remainningMinutes = (int)(numberOfMinutes / oneYearInMinutes);
		
		int numberOfDays = numberOfMinutes % oneDayInMinutes;
		System.out.print(numberOfMinutes + " minutes is approximately "
				+ numberOfYear + " years and " + numberOfDays + " days.");
		
	}
}