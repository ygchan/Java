// A program that displays the following table
// Tip: 1 miles is 1.609 kilometers

public class ConversionMilesToKilometers{
	public static void main(String[] args) {
		final double MILES_TO_KILOMETERS = 1.609;
		
		System.out.print("Miles         Kilometers");
		for (int mile = 1; mile < 11; mile++){
			double kilometer = mile * MILES_TO_KILOMETERS;
			
			// Not sure if it is the point of the exercise, to make sure
			// we can present the numbers in a formatted way
			// otherwise a very simple problem.
			if (mile < 10) {
				if (kilometer >= 10.0) 
					System.out.printf("\n%d %18.3f", mile, kilometer);
				else 
					System.out.printf("\n%d %17.3f", mile, kilometer);
			}
			
			else {
				System.out.printf("\n%d %17.3f", mile, kilometer);
			}
		}
	}
}