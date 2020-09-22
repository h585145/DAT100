package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] i : matrise) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String ut = "";

		for (int[] i : matrise) {
			for (int j : i) {
				ut += Integer.toString(j) + " ";
			}
			ut += "\n";
		}

		return ut;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] skalertMatrise = new int[matrise.length][matrise.length];

		for (int i = 0; i < matrise.length; ++i) {
			for (int j = 0; j < matrise[i].length; ++j) {
				skalertMatrise[i][j] = matrise[i][j] * tall;
			}
		}

		return skalertMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = false;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] == b[i][j]) {
						lik = true;
					}
				}
			}
		}

		return lik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] speiletMatrise = new int[matrise.length][matrise.length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				speiletMatrise[i][j] = matrise[j][i];
			}
		}
		return speiletMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int multiplisert[][] = new int[a.length][a.length];

		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					for (int k = 0; k < a.length; k++) {
						multiplisert[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			return multiplisert;
		} else {
			throw new UnsupportedOperationException("Kolonne a != rad b");
		}

	}
}