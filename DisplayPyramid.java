// A program that prompts the user to enter an integer from 1 to 15
// and display a pyramid.

import java.util.Scanner;

public class DisplayPyramid {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int numberOfLines = 9; // Hold the user input
		int numberOfSpaces = (numberOfLines - 1) * 2;
		
//		// While !(1 <= numberOfLines <= 15)
//		do {
//			// Prompt user for input
//			System.out.print("Enter the number of lines: ");
//			numberOfLines = input.nextInt();
//		} while (!(1 <= numberOfLines) || !(numberOfLines <= 15));
//		
//		int numberOfSpaces = 0;
//		
//		// How many space in front of the first character
//		if (numberOfLines != 1) 
//			 numberOfSpaces = (numberOfLines - 1 ) * 2;
	
		for (int line = 1; line <= numberOfLines; line++) {
			// The spacing offset to the first character
			for (int space = 0; space < numberOfSpaces; space++)
				System.out.print(" ");
			
			// Inner loop that draw all the digits for a from n to 1
			for (int number = line; number > 0; number--) {
				System.out.print(number + " ");
			}
			
			// Inner loop that draw all the digits from 2 to n
			for (int number = 2; number <= line; number++) {
				System.out.print(number + " ");
			}
			
			System.out.println();
			numberOfSpaces -= 2;
		}
	}
}