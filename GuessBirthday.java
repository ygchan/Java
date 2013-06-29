import javax.swing.JOptionPane;

public class GuessBirthday {
	public static void main(String[] args) {
		String set1 =
				"1 3 5 7 9 11 13 15\n" +
				"17 19 21 23 25 27 29 31";
		
		String set2 = 
				"2 3 6 7 10 11 14 15\n" +
				"18 19 22 23 26 27 30 31";
		
		String set3 =
				"4 5 6 7 12 13 14 15\n" +
				"20 21 22 23 28 29 30 31";
		
		String set4 = 
				"8 9 10 11 12 13 14 15\n" +
				"24 25 26 27 28 29 30 31\n";
		
		String set5 = 
				"16 17 18 19 20 21 22 23\n" +
				"24 25 26 27 28 29 30 31";
		
		int day = 0;
		
		// Prompt the user to answer questions
		// Here we use the confirmation dialog box 
		int answer = JOptionPane.showConfirmDialog(null, 
				"Is your birthday in these numbers?\n" + set1);
		if (answer == JOptionPane.YES_OPTION)
			day += 1;
			
		answer = JOptionPane.showConfirmDialog(null, 
				"Is your birthtday in these numbers?\n" + set2);
		if (answer == JOptionPane.YES_OPTION)
			day += 2;
		
		answer = JOptionPane.showConfirmDialog(null, 
				"Is your birthtday in these numbers?\n" + set3);
		if (answer == JOptionPane.YES_OPTION)
			day += 4;
		
		answer = JOptionPane.showConfirmDialog(null, 
				"Is your birthtday in these numbers?\n" + set4);
		if (answer == JOptionPane.YES_OPTION)
			day += 8;
		
		answer = JOptionPane.showConfirmDialog(null, 
				"Is your birthtday in these numbers?\n"+ set5);
		if (answer == JOptionPane.YES_OPTION)
			day += 16;
		
		JOptionPane.showMessageDialog(null, "Your birthday is " +
				day + "!");
	}
}