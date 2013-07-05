// A program that computes the tuition in 10 years and the total cost of
// four year's forth of tuition starting ten years from now

public class ComputeFutureTuition {
	public static void main(String[] args) {
		double baseTuition = 10000;
		final double RATE = 1.05;
		
		System.out.println("The total cost of 4 years tution");

		for (int i = 0; i < 10; i++) {
			// keep track of the next 4 year's tuition
			double fourYearTuition = 0;
			
			for (int j = 0; j < 4; j++)
				// This year + This year * 1.05 ...
				fourYearTuition = baseTuition + (baseTuition * RATE) 
					+ (baseTuition * RATE * RATE) + (baseTuition * RATE * RATE * RATE);
			
			System.out.printf("%2d yrs from now: $%5.2f\n", 
					(i + 1), fourYearTuition);
			// Increase the tuition by 5%
			baseTuition = baseTuition * 1.05;
		}
	}
}