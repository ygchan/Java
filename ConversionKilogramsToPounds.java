// A program that displays the following table
// Tip: 1 kilogram is 2.2 pounds

public class ConversionKilogramsToPounds{
	public static void main(String[] args) {
		final double KILOGRAMS_TO_POUNDS = 2.2;
		
		System.out.print("Kilograms       Pounds");
		for (int kilogram = 1; kilogram < 200; kilogram++) {
			double pound = kilogram * KILOGRAMS_TO_POUNDS;
			
			// Used a simple test to determine how much space needed
			if (kilogram < 10)
				System.out.printf("\n%d %17.1f", kilogram, pound);
			else if (kilogram < 100)
				System.out.printf("\n%d %16.1f", kilogram, pound);
			else
				System.out.printf("\n%d %15.1f", kilogram, pound);
		}
	}
}