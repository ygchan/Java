// A program that prompts the user to enter the first 9 digit and display
// the 10-digit ISBN (including leading zeros).

import javax.swing.JOptionPane;

public class ComputeISBN {
	public static void main(String[] args) {
		// Prompt user to enter the input
		String inputString = JOptionPane.showInputDialog(
				"Enter your first 9 digit of your ISBN: ");

		// Parsing all the digits from the inputString
		int d1 = Integer.parseInt(inputString.substring(0, 1));
		int d2 = Integer.parseInt(inputString.substring(1, 2));
		int d3 = Integer.parseInt(inputString.substring(2, 3));
		int d4 = Integer.parseInt(inputString.substring(3, 4));
		int d5 = Integer.parseInt(inputString.substring(4, 5));
		int d6 = Integer.parseInt(inputString.substring(5, 6));
		int d7 = Integer.parseInt(inputString.substring(6, 7));
		int d8 = Integer.parseInt(inputString.substring(7, 8));
		int d9 = Integer.parseInt(inputString.substring(8, 9));
		
		// Compute the 10th digit
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
				+ d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		// Convert the digits back to String form
		String d1String = String.valueOf(d1);
		String d2String = String.valueOf(d2);
		String d3String = String.valueOf(d3);
		String d4String = String.valueOf(d4);
		String d5String = String.valueOf(d5);
		String d6String = String.valueOf(d6);
		String d7String = String.valueOf(d7);
		String d8String = String.valueOf(d8);
		String d9String = String.valueOf(d9);
		String d10String = String.valueOf(d10);
		
		// Gluing all the digits together
		String result = d1String + d2String + d3String + d4String
				+ d5String + d6String + d7String 
				+ d8String + d9String + d10String;
		
		String message = "Your 10 digits ISBN is: " + result;
		
		// Display the result
		JOptionPane.showMessageDialog(null, message);
		
	}
}