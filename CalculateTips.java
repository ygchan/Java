// Display a 15% tip after your dinner in two decimal points

import java.util.Scanner;

class CalculateTips {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the cost of your dinner: ");
		
		double costOfDinner = input.nextDouble();
		double tip = costOfDinner * 0.15;
		
		System.out.print("A 15% tip is: " + (int)(tip * 100 / 100.0));
	}
}