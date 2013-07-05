// A program that displays the following table
// Tip: 1 kilogram is 2.2 pounds

public class ConversionKilogramsToPounds2{
	public static void main(String[] args) {
		final double KILOGRAMS_TO_POUNDS = 2.2;
		int anotherCounter = 1; // Keep track of how much offset is needed
		
		System.out.print("Kilograms       Pounds         Kilograms       Pounds");
		for (int kilogram = 1; kilogram < 200; kilogram = kilogram + 2) {
			double pound = kilogram * KILOGRAMS_TO_POUNDS;
			
			System.out.printf("\n%-15d %-15.1f", kilogram, pound);
			
			anotherCounter++;
			double pound2 = 15 + (double)(5 * anotherCounter);
			double kilogram2 = pound2 / KILOGRAMS_TO_POUNDS;
			System.out.printf("%-15.0f %-15.2f", pound2, kilogram2);
		}
	}
}