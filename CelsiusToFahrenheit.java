import java.beans.FeatureDescriptor;
import java.util.Scanner;

class CelsiusToFahrenheit {
	public static void main(String[] argus) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		// Convert celsius to fahrenheit
		double fahrenheit = celsius * (9.0 / 5.0) + 32.0;
		System.out.print("Celsius " + celsius + " is " + fahrenheit 
				+ " in fehrenheit. " );
	}
}