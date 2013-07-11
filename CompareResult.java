// Obtain more accurate result?
// Compare the result from left to right vs right to left

public class CompareResult {
	public static void main(String[] args) {
		double lessAccurateSum = 0;
		double moreAccurateSum = 0;
		
		// From left to right (less accurate)
		for (int i = 1; i <= 5000; i++) 
			lessAccurateSum += (1 / i);
		
		System.out.printf("Left to Right: %f\n", lessAccurateSum);
		
		// From right to left (more accurate)
		for (int k = 100; k > 0; k--) {
			moreAccurateSum += (1 / k);
		}
		
		System.out.printf("Right to left: %f\n", moreAccurateSum);
	}
}