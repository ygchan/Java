// Similar to AdditionQuiz.java
// But this time we have two integers under 100

import javax.swing.JOptionPane;

public class AdditionQuiz2 {
	public static void main(String[] args) {
		// Practice how to use Math.random() to generate random number
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		String message = "What is " + number1 + " + " + number2 + "? ";
		
		// Prompt the user for the answer
		String inputString = JOptionPane.showInputDialog(message);
		int input = Integer.parseInt(inputString);
		
		boolean isCorrect = (input == (number1 + number2));
		if (isCorrect)
			JOptionPane.showMessageDialog(null, "You are correct!");
		else
			JOptionPane.showMessageDialog(null, "You are incorrect.");
		
	}
}