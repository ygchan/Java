// Guess number one time

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		// Generate a random number to be guessed
		// This will generate a random number between [0, 101)
		int number = (int)(Math.random() * 101);
		// System.out.println("The number is " + number);
		
		// Create a scanner
		Scanner input = new Scanner(System.in);
		int guess = -1; 
		
		// While the user did not guess it right
		while (guess != number) {
			System.out.println("Guess a magic number between 0 and 100");
			guess = input.nextInt();
			
			if (guess == number)
				System.out.print("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}
		
	}
}