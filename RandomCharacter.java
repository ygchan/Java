// A program that displays a random uppercase letter using 
// the System.CurrentTimeMillis() method

class RandomCharacter{
	public static void main(String[] args){
		// A sudo random value that is based on the current time
		long randomSeed = System.currentTimeMillis();
		
		// We have to put the () in the expression
		int randomNumber = (int)(randomSeed % 26) + 65;
		char ch = (char)randomNumber;
		
		System.out.println(ch);
	}
}