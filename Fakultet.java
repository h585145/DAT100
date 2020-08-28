package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Fakultet {

	public static void main(String[] args) {

		String fakultet = showInputDialog("Skriv inn tall:");

		int fakultetTall = Integer.parseInt(fakultet);

		int fakultetResultat = 1;

		if (fakultetTall < 0) {

			showMessageDialog(null, "Tallet må være over 0");

		} else {

			for (int i = 1; i <= fakultetTall; i++) {

				fakultetResultat = fakultetResultat * i;

			}

			showMessageDialog(null, "Resultat: " + fakultetResultat);
		}
	}

}