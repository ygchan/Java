// A program that simulates picking a card from a deck of 52

public class PickingACard {
	public static void main(String[] args) {
		// The java Math.random() generate a double in the range of [0, 1)
		// The range does not include 1. 
		int rank = (int)(Math.random() * 13);
		int suit = (int)(Math.random() * 4);
		
		// Offset the rank since random() generate [0, 13) 
		rank += 1;
		
		// Testing print statement
		// System.out.print("The rank is " + rank +", and the suit is " + suit);
		
		String result = "The card you picked is ";
		
		// Determine which rank
		if (rank == 1)
			result += "Ace";
		else if (rank == 11)
			result += "Jack";
		else if (rank == 12)
			result += "Queen";
		else if (rank == 13)
			result += "King";
		else
			result += String.valueOf(rank);
		
		result += " of ";
		
		// Determine which suit
		if (suit == 0)
			result += "Clubs";
		else if (suit == 1)
			result += "Diamonds";
		else if (suit == 2)
			result += "Hearts";
		else if (suit == 3)
			result += "Spades";
		
		// Display the result
		System.out.print(result);
	}
}