import java.util.Scanner;

class ComputeGradePointAverage {
	public static void main(String[] args) {
		// Creates a Scanner object and assigns its reference to the variable
		// named input, and it reads input from System.in
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