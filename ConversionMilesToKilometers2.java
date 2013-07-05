// A program that displays the following table
// Tip: 1 miles is 1.609 kilometers

public class ConversionMilesToKilometers2{
	public static void main(String[] args) {
		final double MILES_TO_KILOMETERS = 1.609;
		double kilometerCounter = 1;
		
		System.out.print(
				"Miles           Kilometers     Miles           Kilometers");
		for (int mile = 1; mile < 11; mile++){
			double kilometerA = mile * MILES_TO_KILOMETERS;
			System.out.printf("\n%-15d %-15.3f", mile, kilometerA);
			
			double kilometerB = 15 + kilometerCounter * 5;
			double mileB = kilometerB / MILES_TO_KILOMETERS;
			kilometerCounter++;
			
			System.out.printf("%-15.0f %-15.3f", kilometerB, mileB);
		}
	}
}