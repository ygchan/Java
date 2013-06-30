// A program that prompt user to enter an integer and checks weather
// the number is divisible by both 5 and 6, or neither of them, or just 1.

import javax.swing.JOptionPane;

public class CheckNumber {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter an integer: ");
		int number = Integer.parseInt(input);
		
		// Compute divisible by 5 or 6
		boolean divisibleBy5 = (number % 5 == 0);
		boolean divisibleBy6 = (number % 6 == 0);
		
		// Compute the boolean value
		boolean isBoth = (divisibleBy5 && divisibleBy6);
		boolean isOneOfThem = (divisibleBy5 || divisibleBy6);
		boolean isOneButNotBoth = (divisibleBy5 ^ divisibleBy6);
		
		// Generate output message
		String message = 
			"Is " + input + " divisible by both 5 and 6?   " + isBoth 
			+ "\nIs " + input + " divisible by 5 or 6?   " + isOneOfThem
			+ "\nIs " + input + " divisible by 5 or 6, but not both?   " 
			+ isOneButNotBoth;

		// Display result
		JOptionPane.showMessageDialog(null, message);
		
	}
}