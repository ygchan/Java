// A program that give 10 random addition question between 1 and 15

import java.util.Scanner;

public class AdditionQuizLoop {
	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 10; // Number of questions
		int correctCount = 0; // Count the number of correct answers
		int count = 0; // Count the number of questions
		long startTime = System.currentTimeMillis();
		String output = ""; // Output string is initially empty
		Scanner input = new Scanner(System.in);
		
		while (count < NUMBER_OF_QUESTIONS) {
			// Generate two random number between 1-15
			int number1 = (int)(Math.random() * 15 + 1);
			int number2 = (int)(Math.random() * 15 + 1);
			
			// If number 1 < number2, swap them
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			// Prompt the student to answer
			System.out.print(
					"What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();
			
			// Grade the answer and display the result
			if (number1 + number2 == answer) {
				System.out.println("You are correct! " );
				correctCount++;
			}
			else {
				System.out.println("Your answer is wrong. \n" + number1 +
						" + " + number2 + " should be " + (number1 + number2));

				
				output += "\n" + number1 + "-" + number2 + "=" + answer +
						((number1 - number2 == answer) ? " correct" : " wrong");
			}
			
			// Increase the count
			count++;
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is " + correctCount +
				"\nTest time is " + testTime / 1000 + " seconds\n" + output);
	}
}