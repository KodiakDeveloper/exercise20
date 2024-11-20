package selectionStructures;

import javax.swing.JOptionPane;

public class Ex20 {

	public static void main(String[] args) {

		String manOrWoman;
		
		Double idealWeight, height;

		manOrWoman = JOptionPane.showInputDialog(null, "Input sex (man or woman)");

		manOrWoman = manOrWoman.toLowerCase();

		manOrWoman = manOrWoman.trim();

		if (manOrWoman.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please input a valid data!");
			return;
		}

		height = Double.parseDouble(JOptionPane.showInputDialog(null, "Input height"));

		if (height <= 0) {
			JOptionPane.showMessageDialog(null, "Only positive values and greater than zero are available!!");
			return;
		}

		if (!manOrWoman.equals("man") && !manOrWoman.equals("woman")) {
			
			JOptionPane.showMessageDialog(null, "Sex not found!!");
			
			return;
		}

		if (manOrWoman.equals("man")) {

			idealWeight = (72.7 * height) - 58;

			JOptionPane.showMessageDialog(null, "Ideal Weight for man: " + idealWeight);

		} else if (manOrWoman.equals("woman")) {

			idealWeight = (62.1 * height) - 44.7;

			JOptionPane.showMessageDialog(null, "Ideal Weight for woman: " + idealWeight);
		}
	}
}
