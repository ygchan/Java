// Display the characters in the ACSII character table from '!' to '~'

public class DisplayACSIITable{
	public static void main(String[] args) {

		// Print 10 character per line
		final int CHARACTER_PER_LINE = 10;
		int number= 33;
		int count = 1; 
		char character = (char)number;
		
		while (character != '~') {
			character = (char)number;
			
			// Print 10 characters per line
			if (count % 10 == 0)
				System.out.println(character + " ");
			else
				System.out.print(character + " ");
			
			// Increment the Integer representation of the char
			number++;
			count++;
		}
	}
}