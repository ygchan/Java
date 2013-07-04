// A program that let the user guess the head or tail of a coin

import javax.swing.JOptionPane;

class GameHeadOrTail {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Head or Tail? (0 or 1)");
		
		// Generate a random value between 0 and 1
		int seed = (int)(Math.random() * 2);
		
		// Assign the coin flip
		boolean isHead = (seed == 1);
		System.out.print(isHead);
		
		String result = "You are ";
		
		if (isHead) {
			if (input.equals("Head"))
				result += "correct!";
			else
				result += "incorrect.";
		}
		else if (!isHead) {
			if (input.equals("Tail"))
				result += "correct";
			else
				result += "incorrect.";
		}
		
		// Display result
		JOptionPane.showMessageDialog(null, result);
	}
}