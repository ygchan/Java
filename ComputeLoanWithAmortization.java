import java.util.Scanner;

public class ComputeLoanWithAmortization {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Test unit with known output value
		double loanAmount = 10000;
		int numberOfYear = 1;
		double annualInterestRate = 0.07;
		
		// Compute monthly interest rate
		// Monthly interest rate: Annual Interest / 12 / 100
		// The balance: The remaining principal
		double monthlyInterestRate = annualInterestRate / 1200;
		
		String output = "Payment#\t Interest\t Principal\t Balance \n"; 
		System.out.print(output);
		
		for (int month = 1; month <= (numberOfYear * 12); month++) {
		}
	}
}