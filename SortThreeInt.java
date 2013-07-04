// A program that sort three integers

import java.util.Scanner;

public class SortThreeInt {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int temp; // Used for Swapping
		
		if (num1 >= num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 >= num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 >= num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.print(num1 + " <= " + num2 + " <= " + num3);
	}
}