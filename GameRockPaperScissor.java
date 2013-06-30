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
		
		String message = "The computer is " + computerInput + ". You are "
				+ humanInput;
		
		// Determine who win
		boolean isTie = computerInput.equals(humanInput);
		boolean isWin = 
			((computerInput.equals("rock") && humanInput.equals("scissor")) ||
			(computerInput.equals("paper") && humanInput.equals("rock")) ||
			(computerInput.equals("scissor") && humanInput.equals("paper")));
		
		// Prepare the message
		if (isWin)
			message += ". Computer Won.";
		else if (isTie)
			message += " too. It is Tie";
		// There are 3 options, computer win, tie, or you win
		// So we don't have to test here, if the code reach here, human win.
		else
			message += ". You Won";
			
		
		// Display the result on the screen
		JOptionPane.showMessageDialog(null, message);
	}
}