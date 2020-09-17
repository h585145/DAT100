package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}

		System.out.print("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String[] resultat = new String[tabell.length];
		String out = "";

		for (int v = 0; v < tabell.length; v++) {

			String tabellTall = Integer.toString(tabell[v]);

			if (v < tabell.length - 1) {

				resultat[v] = (tabellTall + ",");

			} else {

				resultat[v] = (tabellTall);

			}
			out += resultat[v];
		}

		return "[" + out + "]";
	}

	// c)
	public static int summerUtvidet(int[] tabell) {

		int sum = 0;

		for (int v : tabell) {

			sum += v;

		}

		return sum;
	}

	public static int summer(int[] tabell) {

		int sum = 0;

		for (int v = 0; v < tabell.length; v++) {

			sum += tabell[v];

		}

		return sum;
	}

	public static int summerWhile(int[] tabell) {

		int sum = 0;
		int v = 0;

		while (v < tabell.length) {
			sum += tabell[v];
			v++;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int v = 0;
		boolean tallFins = false;

		while (v < tabell.length && tallFins != true) {

			if (tall == tabell[v]) {
				tallFins = true;
			} else {
				tallFins = false;
			}
			v++;
		}
		return tallFins;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int v = 0;
		int tallPos = -1;
		boolean tallPosFunnet = false;

		while (v < tabell.length && tallPosFunnet != true) {

			if (tall == tabell[v]) {
				tallPos = v;
				tallPosFunnet = true;
			}

			v++;
		}
		return tallPos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int k = tabell.length - 1;
		int[] reversert = new int[tabell.length];

		for (int v = 0; v < tabell.length; v++) {
			reversert[k] = tabell[v];
			k--;
		}
		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int v = 0;
		boolean sortert = true;

		while (v < tabell.length - 1 && sortert == true) {

			if (tabell[v] > tabell[v + 1]) {
				sortert = false;
			}
			v++;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] tabellSammen = new int[tabell1.length + tabell2.length];

		int pos = 0;

		for (int v : tabell1) {
			tabellSammen[pos] = v;
			pos++;
		}

		for (int v : tabell2) {
			tabellSammen[pos] = v;
			pos++;
		}

		return tabellSammen;

	}
}
