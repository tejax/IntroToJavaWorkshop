package Day4;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	public static void main(String[] args) {
		Random numGen = new Random();
		int randInt = numGen.nextInt(101);
		int trys = 1;
		int ansAsInt = -1;
		while (ansAsInt != randInt) {
			String ans = JOptionPane.showInputDialog("pick a number between 1 and 100");
			ansAsInt = Integer.parseInt(ans);
			System.out.println(ansAsInt);
			System.out.println(randInt);
			if (ansAsInt > randInt) {
				JOptionPane.showMessageDialog(null, "Try again! Lower.");
				trys++;
			}
			if (ansAsInt < randInt) {
				JOptionPane.showMessageDialog(null, "Try again! Higher.");
				trys++;
			}
		}
		
		if (ansAsInt == randInt) {
			JOptionPane.showMessageDialog(null, "Correct! " +trys +" trys.");
		}

	}
}
