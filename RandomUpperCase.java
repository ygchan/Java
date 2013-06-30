// A program that display a random upper case letter

import javax.swing.JOptionPane;

public class RandomUpperCase{
	public static void main(String[] args) {
		int randomNumber = 65 + (int)(Math.random() * 26);
		String result = "You get a letter: " + (char)randomNumber;
		JOptionPane.showMessageDialog(null, result);
	}
}