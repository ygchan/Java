// Using remainder operator to calculate what day it is going to be
// after x amount of days later. Note, Day 0 in a week is Sunday.

class Remainder {
	public static void main(String[] args) {
		int today = 1; // Today is a Monday
		int amountOfDays = 492; // How many days later we want to check
		int thatDay = (today + amountOfDays) % 7;
		
		System.out.print("After " + amountOfDays + " later, it is going to be "
				+ thatDay + " of the week.");
	}
}