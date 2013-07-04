// Program that determine if the year is leap year
// Implement a swing GUI Message box as an update

import javax.swing.JOptionPane;

public class DetermineLeapYear {
	public static void main(String[] args) {
		// Prompt user for a year input
		String yearString = JOptionPane.showInputDialog("Enter a year: ");
		int year = Integer.parseInt(yearString);

		// A leap year is divisible by 4
		boolean isLeapYear = (year % 4 == 0);
		
		// A leap year is divisible by 4 but not by 100
		isLeapYear = isLeapYear &&  (year % 100 != 0);
		
		// A leap year is divisible by 4 but not by 100 or divisible by 400
		isLeapYear = isLeapYear || (year % 400 == 0);
		
		String message = ("The year " + year);
		
		if (isLeapYear)
			message += " is a leap year.";
		else
			message += " is not a leap year.";
		
		JOptionPane.showMessageDialog(null, message);
	}
}