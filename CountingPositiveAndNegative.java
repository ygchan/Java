// Write a program that reads an unspecified number of integers, determine
// how many positive and negative values have been read, and compute the
// total and average of the input value (not counting zeros).

import java.util.Scanner;

public class CountingPositiveAndNegative {
	public static void main(String[] args) {
		// Display the instruction
		System.out.println(
				"Enter an int value, the program exits if the input is 0");
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int positive = 0; // the number of positive integer
		int negative = 0; // the number of negative integer
		int total = 0; // the number of number entered
		double sum = 0.0; // the sum of all the integers
		
		// While the number is not 0
		while (number != 0) {
			// Count the positive
			if (number > 0 )
				positive++;
			// Count the negative
			else
				negative++;
			// Count the total
			total++;
			sum += number;
			
			number = input.nextInt();
		}
		
		// Compute the total and the average
		double average = sum / total;
		
		System.out.println("The number of positives is " + positive);
		System.out.println("The nubmer of negatives is " + negative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}
}