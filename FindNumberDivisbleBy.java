// A program that displays all the numbers from 100 to 1000,
// ten per line, that are divisible by 5 and 6.

public class FindNumberDivisbleBy {
	public static void main(String[] args) {
		// Display 10 numbers per line, to display 2 of these lines
		final int NUMBER_PER_LINE = 10;
		int counter = 1;

		for (int number = 100; number <= 1000; number = number + 1) {
			// True if it is divisible by 5 and 6
			boolean isDivisible =
					((number % 5 == 0) && (number % 6 == 0));
			
			if (isDivisible) {
				// Go to next line when it is 10th number, or the 1st
				if (counter % NUMBER_PER_LINE == 0) 
					System.out.println(number + " ");
				
				// Otherwise append to it on the same line
				else
					System.out.print(number + " ");
				counter++;
			}
		}
	}
}