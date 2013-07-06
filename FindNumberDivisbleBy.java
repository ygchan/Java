// A program that displays all the numbers from 100 to 1000,
// ten per line, that are divisible by 5 and 6.

public class FindNumberDivisbleBy {
	public static void main(String[] args) {
		// Display 10 numbers per line, to display 2 of these lines
		final int NUMBER_PER_LINE = 10;
		
		for (int i = 1; i <= 20; i++) {
			// Go to next line when it is 10th number, or the 1st
			if (i % NUMBER_PER_LINE == 0) 
				System.out.println(i + " ");
			
			// Otherwise append to it on the same line
			else
				System.out.print(i + " ");
		}
		
		int testNumber = 30; // Test case we know is divisible by 5 and 6
		int testNumber2 = 25; // Test case we know it does not
		
		// Find out if a number is divisible by 5 and 6
		if ((testNumber2 % 5 == 0) && (testNumber2 % 6 == 0))
			System.out.println(testNumber2 + " is divisible by 5 and 6.");
		else 
			System.out.println(testNumber2 + " is not divisible both by 5 and 6.");
		
	}
}