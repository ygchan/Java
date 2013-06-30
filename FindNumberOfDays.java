// Prompt the user to input month and year, and return the number of days

import javax.swing.JOptionPane;

public class FindNumberOfDays {
	public static void main(String[] args) {
		
		// Prompt user for the year
		String yearString = JOptionPane.showInputDialog(
				"Enter which year you are looking for: ");
		int year = Integer.parseInt(yearString);
		
		// Compute if it is a leap year
		// Review: It is a leap year if it is divisible by 4, not divisible by
		// 100 and divisible by 400.
		boolean isLeap = (year % 4 == 0);
		isLeap = isLeap && (year % 100 != 0);
		isLeap = isLeap || (year % 400 == 0);
		
		// Prompt user for the month
		String monthString = JOptionPane.showInputDialog(
				"Enter which month you are looking for: ");
		int month = Integer.parseInt(monthString);

		// Compute if it is BIG (31 days month)
		boolean isBig = (month == 1 || month == 3 || month == 5 
				|| month == 7 || month == 8 || month == 12);
		
		String result = "There are ";
		
		// BIG Months, ie: 1, 3, 5, 7, 8, 10, 12
		if (isBig) {
			result += "31 days!";
		}
		
		// SMALL Months, ie: 2, 4, 6, 9, 11
		else {
			// Special case on February
			if (month == 2 && isLeap) 
							result += "29 days!";
			else if (month == 2)
				result += "28 days!";
			else
				result += "30 days!";
		}
		
		// Display result
		JOptionPane.showMessageDialog(null, result);
	}
}