// A program that lets the user enter the loan amount and loan period in
// number of years and display the monthly and total payment for each 
// interest rate starting from 5% to 8%, with an increment of 1/8

import java.util.Scanner;

public class ComputeLoansWithVariousInterest {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for years
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int numberOfYear = input.nextInt();
		
		// From 5% to 8%...
		for (double interestRate = 5.0; interestRate <= 8.0; 
				interestRate = interestRate + 0.125) {
			System.out.println(interestRate);
		}
			// Compute the monthly payment and total payment
			// Monthly payment: 
			// Total payment:
	}
}