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
		
		String message = input + " is ";
		
		if (divisibleBy5 && divisibleBy6) 
			message += "divisible by both 5 and 6.";
		else if (divisibleBy5 || divisibleBy6)
			message += "divisible by 5 or 6, but not both. ";
		else
			message += "not divisible by either 5 or 6";
		
		// Display result
		JOptionPane.showMessageDialog(null, message);
		
	}
}