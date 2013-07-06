// Find the smallest N^2 that is greater than 12,000

public class SmallestN {
	public static void main(String[] args) {
		final int target = 12000; 
		int n = 1;
		
		while (Math.pow(n, 2) < 12000)
			n++;
		
		System.out.println(n);
	}
}