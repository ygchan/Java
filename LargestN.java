// Find the largest n, such that n^3 < 12000

public class LargestN {
	public static void main(String[] args) {
		final int target = 12000; 
		int n = target / 2;
		
		while (Math.pow(n, 3) > target){
			n--;
		}
		
		System.out.println(n + ", " + Math.pow(n,  3));
	}
}