// Guess number one time

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		// Generate a random number to be guessed
		// This will generate a random number between [0, 101)
		int number = (int)(Math.random() * 101);
		
		// Prompt user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		int guess = input.nextInt();
		
		// Determine if the guess is correct
		if (guess == number)
			System.out.print("Yes, the number is " + number);
		else if (guess > number)
			System.out.println("Your guess is too high");
		else
			System.out.println("Your guess is too low");
	}
}