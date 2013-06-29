class IsEven {
	public static void main(String[] args) {
		// A simple random number
		int number = (int)(System.currentTimeMillis() % 10);
		// A shorter method to get the boolean value of even
		boolean even = number % 2 == 0;
		
		System.out.println("The number " + number + " is even? " + even);
	}
}