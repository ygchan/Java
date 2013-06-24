import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		// Convert Fahrenheit to Celsius
		// Division of two integers yields an integer in JAVA...
		double celsius = (5.0 / 9.0) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius +
				" in Celsius");
	}
}