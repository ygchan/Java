// Write a program that converts pounds into kilograms. The program prompt
// the user to enter a number in pounds, converts it to kilograms, and
// display the result. One pound is 0.454 kilograms.

import java.util.Scanner;

class ConvertingPoundsIntoKilograms {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.454;
		System.out.print(pounds + " pounds is " + kilograms + " killograms");
	}
}