// A program that lets the user enter the loan amount and loan period in
// number of years and display the monthly and total payment for each 
// interest rate starting from 5% to 8%, with an increment of 1/8

//5.0% Monthly payment: 29.229502075399004 Total payment: 8768.850622619702
//5.125% Monthly payment: 29.59479664090074 Total payment: 8878.438992270221
//5.25% Monthly payment: 29.96238575856374 Total payment: 8988.715727569122
//5.375% Monthly payment: 30.332251232072707 Total payment: 9099.675369621813
//5.5% Monthly payment: 30.70437461407336 Total payment: 9211.312384222008
//5.625% Monthly payment: 31.07873721653655 Total payment: 9323.621164960965
//5.75% Monthly payment: 31.455320121132658 Total payment: 9436.596036339797
//5.875% Monthly payment: 31.83410418962856 Total payment: 9550.231256888568
//6.0% Monthly payment: 32.21507007427572 Total payment: 9664.521022282717
//6.125% Monthly payment: 32.59819822819661 Total payment: 9779.459468458983
//6.25% Monthly payment: 32.98346891575235 Total payment: 9895.040674725704
//6.375% Monthly payment: 33.37086222287677 Total payment: 10011.25866686303
//6.5% Monthly payment: 33.76035806738209 Total payment: 10128.107420214628
//6.625% Monthly payment: 34.151936209209296 Total payment: 10245.580862762788
//6.75% Monthly payment: 34.54557626063235 Total payment: 10363.672878189705
//6.875% Monthly payment: 34.941257696390586 Total payment: 10482.377308917175
//7.0% Monthly payment: 35.33895986375454 Total payment: 10601.687959126362
//7.125% Monthly payment: 35.73866199251147 Total payment: 10721.59859775344
//7.25% Monthly payment: 36.14034320485816 Total payment: 10842.102961457449
//7.375% Monthly payment: 36.5439825252055 Total payment: 10963.19475756165
//7.5% Monthly payment: 36.94955888987279 Total payment: 11084.867666961838
//7.625% Monthly payment: 37.35705115667978 Total payment: 11207.115347003935
//7.75% Monthly payment: 37.76643811441548 Total payment: 11329.931434324644
//7.875% Monthly payment: 38.17769849218884 Total payment: 11453.309547656652
//8.0% Monthly payment: 38.59081096865028 Total payment: 11577.243290595085

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
			// Obtain the monthly interest rate
			double monthlyInterestRate = interestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / 
					(1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYear * 12));
			double totalPayment = monthlyPayment * numberOfYear * 12;
			
			System.out.print("\n" + interestRate + "%\t ");
			System.out.print("Monthly payment: " + monthlyPayment + "\t ");
			System.out.print("Total payment: " + totalPayment);
		}
			// Compute the monthly payment and total payment
			// Monthly payment: 
			// Total payment:
	}
}