import java.util.Scanner;

class ComputeGradePointAverage {
	public static void main(String[] args) {
		// Create a new Scanner object reference
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter grade test grade
		System.out.print("Enter your last 3 test grade: ");
		double grade1 = input.nextDouble();
		double grade2 = input.nextDouble();
		double grade3 = input.nextDouble();
		
		// Compute the average
		double gradePointAverage = (grade1 + grade2 + grade3) / 3;
		
		// Display the average
		System.out.print("The grade point average is: " + gradePointAverage);
	}
}