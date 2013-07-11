import java.util.Scanner;

public class ComputeLoanWithAmortization {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt for years and annual interest rate
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int numberOfYear = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();

		// Compute monthly interest rate
		// Monthly interest rate: Annual Interest / 12 / 100
		// The balance: The remaining principal
		double monthlyInterestRate = annualInterestRate / 12.0;

		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / 
				(1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYear * 12));
		double totalPayment = monthlyPayment * numberOfYear * 12;

		System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Annual Interest Rate: %.2f\n\n", totalPayment);

		double monthlyInterest = 0;
		double principal = 0;
		double balance = loanAmount; // Initially the balance is the full amount

		String output = "Payment#\t Interest\t Principal\t Balance \n"; 
		System.out.print(output);

		for (int month = 1; month <= (numberOfYear * 12); month++) {
			// Calculate how much interest for current month
			monthlyInterest = balance * monthlyInterestRate;
			principal = monthlyPayment - monthlyInterest;
			balance -= principal;
			
			// Display the message
			System.out.printf("%d\t\t %.2f\t\t %.2f\t\t %.2f\n", 
					month, monthlyInterest, principal, balance);

		}
	}
}