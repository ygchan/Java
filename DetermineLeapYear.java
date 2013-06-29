// Program that determine if the year is leap year

public class DetermineLeapYear {
	public static void main(String[] args) {
		// Get a random year between 0 - 2013
		int randomYear = (int)(System.currentTimeMillis() % 2013);
		
		// A leap year is divisible by 4
		boolean isLeapYear = (randomYear % 4 == 0);
		
		// A leap year is divisible by 4 but not by 100
		isLeapYear = isLeapYear &&  (randomYear % 100 != 0);
		
		// A leap year is divisible by 4 but not by 100 or divisible by 400
		isLeapYear = isLeapYear || (randomYear % 400 == 0);
		
		System.out.print("The year " + randomYear);
		
		if (isLeapYear)
			System.out.print(" is a leap year.");
		else
			System.out.print(" is not a leap year.");
	}
}