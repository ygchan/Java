// A program that display the current time, with the user input a offset

import java.util.Scanner;

class CurrentTime {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Adjust the offset to the current hour, note that we have to include
		// the offset before we calculate current hours. 
		// Prompt user to ask what is the time zone offset
		System.out.print("Enter the time zone offset to GMT: ");
		long offset = input.nextLong();
		
		long totalMillSeconds = System.currentTimeMillis();
		
		long totalSeconds = totalMillSeconds / 1000;
		long currentSecond = (int)totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHour = (totalHours + offset) % 24;
		
		System.out.print("The current time: " + currentHour + ":" 
				+ currentMinute + ":" + currentSecond);				
	}
}