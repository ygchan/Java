class IsEven {
	public static void main(String[] args) {
		// A simple random number
		int number = (int)(System.currentTimeMillis() % 10);
		boolean even;
		
		if (number % 2 == 0)
			even = true;
		else
			even = false;
		
		System.out.println("The number " + number + " is even? " + even);
	}
}