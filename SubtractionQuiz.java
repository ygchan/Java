import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		// Generate two random single digit integers
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() * 7 % 10);
		
		// If number1 < number2, swamp them
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// Prompt the user to answer the question
		System.out.print
			("What is " + number1 + " - " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		// Grade the answer and display the result
		if (number1 - number2 == answer)
			System.out.print("You are correct!");
		else
			System.out.print("Your answer is wrong\n" + number1 + " - "
				+ number2 + " should be " + (number1 - number2));
	}
}