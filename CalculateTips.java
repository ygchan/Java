// Display a 15% tip after your dinner in two decimal points

import java.util.Scanner;

class CalculateTips {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.println("Note: Please enter your number as 1156" 
				+ " instead of 11.56");
		System.out.print("Enter the cost of your dinner: ");
		
		int costOfDinner = input.nextInt();
		double tip = costOfDinner * 0.15 / 100;
		
		System.out.print("A 15% tip is: " + (int)(tip * 100 / 100.0));
	}
}