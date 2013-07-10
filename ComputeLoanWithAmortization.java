import java.util.Scanner;

public class ComputeLoanWithAmortization {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt for years and annual interest rate
//		System.out.print("Loan Amount: ");
//		double loanAmount = input.nextDouble();
//		
//		System.out.print("Number of Years: ");
//		int numberOfYear = input.nextInt();
//		
//		System.out.print("Annual Interest Rate: ");
//		double annualInterestRate = input.nextDouble();
		
		// Test unit with known output value
		double loanAmount = 10000;
		int numberOfYear = 1;
		double annualInterestRate = 0.07;
		
		
		// Compute monthly interest rate
		// Monthly interest rate: Annual Interest / 12 / 100
		// The balance: The remaining principal
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Compute monthly payment
		// Monthly payment: loan amount * monthly interest rate / 
		//                  (1 - 1 / (1 + monthly interest rate) ^ years * 12
		double monthlyPayment = (loanAmount * monthlyInterestRate) / 
				(1 - 1 / Math.pow((1 + monthlyInterestRate), (numberOfYear * 12)));
		
		double totalPayment = monthlyPayment * 12 * numberOfYear;
		
		System.out.println("Monthly payment: " + monthlyPayment);
		System.out.println("Total payment: " + totalPayment);
		
		// Compute total payment
		// Total payment = monthly payment * 12 * years
		
		// Display the payment plan
	}
}