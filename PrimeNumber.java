public class PrimeNumber {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50; // number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // display 10 per line
		int count = 0; // count the number of prime numbers
		int number = 2; // a number to be tested for primeness
		
		System.out.println("The first 50 prime numbers are \n");
		
		// Repeatedly find prime numbers
		while (count < NUMBER_OF_PRIMES) {
			// assume the number is prime
			boolean isPrime = true; // is the current number prime?
			
			// test whether the number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) { // if true, number is not prime
					isPrime = false; // set isPrime to false
					break; // exit the loop
				}
			}
			
			// print the prime number and increase the count
			if (isPrime) {
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// print out the number and advance to the new line
					System.out.println(number);
				}
				else 
					System.out.print(number + " ");
			}
			
			// check if the next number is prime
			number++;
		}
	}
}