// A program that receives an ASCII and display its character

import java.util.Scanner;

class CovertASCII {
	public static void main(String[] args) {
		
		// Prompt user for an ASCII code input
		System.out.print("Enter an ASCII code: ");
		Scanner input = new Scanner(System.in);
		
		int code  = input.nextInt();
		// Cast the int into a character
		System.out.print("The character for ASCII code " + code
				+ " is " + (char)code );
	}
}