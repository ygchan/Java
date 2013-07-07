// A program that prompts the user to enter an integer from 1 to 15
// and display a pyramid.

import java.util.Scanner;

public class DisplayPyramid {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int numberOfLines = 0; // Hold the user input
		
		// While !(1 <= numberOfLines <= 15)
		do {
			// Prompt user for input
			System.out.print("Enter the number of lines: ");
			numberOfLines = input.nextInt();
		} while (!(1 <= numberOfLines) && !(numberOfLines <= 15));
		
		int numberOfSpaces = 0;
		
		// How many space in front of the first character
		if (numberOfLines != 1) 
			 numberOfSpaces = (numberOfLines - 1 ) * 2;
	
		
		
		for (int i = 1; i <= numberOfLines; i++) {
			// Display the space offset of the first character
			for (int j = 0; j <= numberOfSpaces; j++) 
				System.out.print(" ");
				System.out.print("Hello World");
			for (int k = i; k <= i; k++)
				System.out.print(k);
		}
	}
}