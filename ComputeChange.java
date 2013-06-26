import java.util.Scanner;
import javax.swing.JOptionPane;

public class ComputeChange {
	public static void main(String[] args) {
		// Prompt user for the amount
		String amountString = JOptionPane.showInputDialog(
				"Enter an amount in double, for example 11.56: ");
		double amount = Double.parseDouble(amountString);
		
		int remainingAmount = (int)(amount * 100);
		
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount %= 100;
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;
		
		// Find the number of quarters in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;
	
		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		// Create the output string
		String output = "Your amount " + amount + " consist of \n" 
				+ "\t" + numberOfOneDollars + " dollars\n" 
				+ "\t" + numberOfQuarters + " quaters\n" 
				+ "\t" + numberOfDimes + " dimes\n" 
				+ "\t" + numberOfNickels + " nickels\n" 
				+ "\t" + numberOfPennies + " pennies\n";
		
		// Display results using the Dialog Box
		JOptionPane.showMessageDialog(null, output);
	}
		
}