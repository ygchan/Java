// A program that displays a random uppercase letter using 
// the System.CurrentTimeMillis() method

class RandomCharacter{
	public static void main(String[] args){
		// A sudo random value that is based on the current time
		long randomSeed = System.currentTimeMillis();
		
		randomSeed = randomSeed / 1000 % 26 + 65;
		char ch = (char)randomSeed;
		
		System.out.println(ch);
	}
}