// A payroll application

import java.util.Scanner;

class payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the name input
		System.out.print("Enter employee's name: ");
		String employeeName = input.next();
		
		// Prompt user for the work hour input
		System.out.print("Enter number of hours worked in a week: ");
		int workedHours = input.nextInt();
		
		// Prompt user for the federal tax withholding rate input
		System.out.print("Enter federal tax withhodling rate: ");
		double federalWithholdingRate = input.nextDouble();
	}
}