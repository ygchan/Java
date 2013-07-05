// A program that prompts the user to enter the number of students and each
// student's name and score, display the student with the highest score and
// and student with second highest score

import java.util.Scanner;

public class FindingTheHighestScore{
	public static void main(String arg[] ){
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		// Prompt the user to ask how many students are there
		System.out.print("How many students are there? ");
		int numberOfStudent = input.nextInt();
		String topStudentName = "";
		int topStudentScore = 0;
		
		// For (n) student..
		for (int i = 0; i < numberOfStudent; i++)
		{
			// Ask for name
			System.out.print("What is the student's name: ");
			String studentName = input.next();
			// Ask for score
			System.out.print("What is the student's score: ");
			int studentScore = input.nextInt();
			
			// Test if this student is the highest?
			if (studentScore > topStudentScore) {
				topStudentName = studentName;
				topStudentScore = studentScore;
			}
		}
		
		// Display the result
		System.out.printf("The best student is %s, and the score is %2d.", 
				topStudentName, topStudentScore);
	}
}