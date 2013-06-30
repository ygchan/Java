import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		// Generate a lottery
		// Random Number = minimum + (int)(Math.random() * maximum)
		int lottery = 100 + (int)(Math.random() * 900);
		
		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		
		// Get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery % 100 / 10;
		int lotteryDigit3 = lottery % 10;
		
		// Get digits from guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess % 100 / 10;
		int guessDigit3 = guess % 10;
		
		// Testing print statement
		// System.out.println("Digit1 is: " + guessDigit1);
		// System.out.println("Digit2 is: " + guessDigit2);
		// System.out.println("Digit3 is: " + guessDigit3);
		
		// Compute the digit match
		boolean isDigit1Match = (guessDigit1 == lotteryDigit1) ||
			(guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit3);
		boolean isDigit2Match = (guessDigit2 == lotteryDigit1) ||
			(guessDigit2 == lotteryDigit2) || (guessDigit2 == lotteryDigit3);
		boolean isDigit3Match = (guessDigit3 == lotteryDigit1) ||
			(guessDigit3 == lotteryDigit2) || (guessDigit3 == lotteryDigit3);
		
		System.out.println("Digit 1 Match " + isDigit1Match);
		System.out.println("Digit 2 Match " + isDigit2Match);
		System.out.println("Digit 3 Match " + isDigit3Match);
		
		System.out.println("The lottery number is " + lottery);
		
		// Check the guess
		if (guess == lottery)
			System.out.println("Exact mach: you win $10,000");
		else if ((isDigit1Match && isDigit2Match) || 
				(isDigit1Match && isDigit3Match) ||
				(isDigit2Match && isDigit3Match))
			System.out.println("Match all digits: you win $3,000");
		else if (isDigit1Match || isDigit2Match || isDigit3Match)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
	}
}