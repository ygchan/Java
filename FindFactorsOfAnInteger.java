// A program that reads an integer and displays all its smallest factors in 
// increasing order

public class FindFactorsOfAnInteger {
	public static void main(String[] args) {
		int factor = 2; // Starting factor
		int number = 120; // Test case for program
		
		while (factor <= number) {
			
			// This is a factor of the number
			if (number % factor == 0) {
				System.out.print(factor + " ");
				number = number / factor;
			}
			else
				factor++;
		}
	}
}