// A program that reads an integer and checks whether it is even

import javax.swing.JOptionPane;

public class DetermineIfEven {
	public static void main(String[] args) {
		// Get the input using a GUI
		String numberString = JOptionPane.showInputDialog("Enter an integer: ");
		
		// Cast the String to int using Integer.parseInt
		int number = Integer.parseInt(numberString);
		
		// Practicing Conditional Expression
		boolean isEven = (number % 2 == 0);
		
		String result = "Is " + number + " an even number? ";
		if (isEven)
			result += "YES!";
		else
			result += "NO!";
		
		// Display the result on the screen
		JOptionPane.showMessageDialog(null, result);
	}
}