// A program that explore accurate results

public class ObtainAccurateResult {
	public static void main(String[] args) {
		final int N = 500000;
		double leftToRightresult = 0;
		
		// From left to right
		for (int i = 1; i <= N; i++)
			leftToRightresult += (1.0 / i);
		
		System.out.println(leftToRightresult);
		
		double rightToLeftResult = 0;
		
		// From right to left
		for (int j = N; j >= 1; j--)
			rightToLeftResult += (1.0 / j);
		
		System.out.println(rightToLeftResult);
	}
}