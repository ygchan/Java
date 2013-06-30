// A game that plays rock paper scissor with user

import javax.swing.JOptionPane;

public class GameRockPaperScissor {
	public static void main(String[] args) {
		// Prompt the user to input the option they choose
		String humanInput = JOptionPane.showInputDialog(
				"Enter rock(0), paper(1), or scissor(2):");
		
		// Generate a random number
		// Scissor (0),  rock (1), paper (2)
		int random = (int)(Math.random() * 3);
		String computerInput; // Computer's choice
		if (random == 0) 
			computerInput = "rock";
		else if (random == 1)
			computerInput = "paper";
		else
			computerInput = "scissor";
		
		// Determine who win
		// There are 3 possibility, win, lose, or tie
		
		// Display the result on the screen
		String message = "The computer is " + computerInput + ". You are "
				+ humanInput + " too. ";
		JOptionPane.showMessageDialog(null, message);
	}
}