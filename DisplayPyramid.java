// A program that prompts the user to enter an integer from 1 to 15
// and display a pyramid.
/*
 * 
                                  1 
                                2 1 2 
                              3 2 1 2 3 
                            4 3 2 1 2 3 4 
                          5 4 3 2 1 2 3 4 5 
                        6 5 4 3 2 1 2 3 4 5 6 
                      7 6 5 4 3 2 1 2 3 4 5 6 7 
                    8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 
                  9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 
               10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 
            11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 
         12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 
      13 12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 13 
   14 13 12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 13 14 
15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
 

*/

import java.util.Scanner;

public class DisplayPyramid {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int numberOfLines = 15; // Hold the user input
		
		// The base case if the numberOfLines is from 1 to 9
		int numberOfSpaces = (numberOfLines - 9) * 2 + 1;
		
		// Special case if the numberOfLines is 10 OR greater
		if (numberOfLines >= 10)
			numberOfSpaces += 3;
		
		// Continue to handle the case where it is greater than 10
		if (numberOfLines > 10)
			numberOfSpaces += (numberOfLines - 10) * 4;
		
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
			if (line > 10)
				numberOfSpaces -= 3;
			else if (line == 10)
				numberOfSpaces -= 3;
			else
				numberOfSpaces -= 2;
			
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
		}
	}
}