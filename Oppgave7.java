package no.hvl.dat100;

import static javax.swing.JOptionPane.*; 

public class Oppgave7 {

	public static void main(String[] args) {
		
		//b)
		for(int antallStudenter = 0; antallStudenter < 10; antallStudenter++) {
		
			String poengsum = showInputDialog("Poengsum:");
		
			int poengsumTall = Integer.parseInt(poengsum);
					
			if(poengsumTall < 0 || poengsumTall > 100) {
				
				//c)			
				do {
					
					poengsum = showInputDialog("Poengsummen kan ikke være negativ eller over 100" + "\n Skriv inn nytt tall");
					
					poengsumTall = Integer.parseInt(poengsum);
					
				}while(poengsumTall < 0 || poengsumTall > 100);
			
			}
		
			if(poengsumTall <= 100 && poengsumTall >= 90) {
			
				showMessageDialog(null, "Karakter A");
			
			}
		
			if(poengsumTall <= 89 && poengsumTall >= 80) {
			
				showMessageDialog(null, "Karakter B");
			
			}
		
			if(poengsumTall <= 79 && poengsumTall >= 60) {
			
				showMessageDialog(null, "Karakter C");
			
			}
		
			if(poengsumTall <= 59 && poengsumTall >= 50) {
			
				showMessageDialog(null, "Karakter D");
			
			}
		
			if(poengsumTall <= 49 && poengsumTall >= 40) {
			
				showMessageDialog(null, "Karakter E");
			
			}
		
			if(poengsumTall <= 39 && poengsumTall >= 0) {
			
				showMessageDialog(null, "Karakter F");
			
			}
		
		}

	}

}