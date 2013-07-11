import java.util.Scanner;

public class ComputeLoanWithAmortization {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Test unit with known output value
		double loanAmount = 10000.0;
		int numberOfYear = 1;
		double annualInterestRate = 0.07;

		// Compute monthly interest rate
		// Monthly interest rate: Annual Interest / 12 / 100
		// The balance: The remaining principal
		double monthlyInterestRate = annualInterestRate / 12.0;

		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / 
				(1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYear * 12));
		double totalPayment = monthlyPayment * numberOfYear * 12;

		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Annual Interest Rate: %.2f", totalPayment);

		double monthlyInterest = 0;
		double principal = loanAmount;
		double balance = 0;

		// String output = "Payment#\t Interest\t Principal\t Balance \n"; 
		// System.out.print(output);

		for (int month = 1; month <= (numberOfYear * 12); month++) {
			// Calculate how much interest for current month
			monthlyInterest = principal * monthlyInterestRate;
			principal = principal;
			// System.out.println(monthlyInterest);
		}
	}
}