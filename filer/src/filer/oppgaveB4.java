package filer;

import static javax.swing.JOptionPane.showInputDialog;

public class oppgaveB4 {

	public static void main(String[] args) {
		// Basert på data fra https://www.skatteetaten.no/satser/trinnskatt/?year=2022#rateShowYear

		long[] trinn = {190349, 267899, 643799, 969199, 1999999};
		double[] satser = {0.017, 0.040, 0.134, 0.164, 0.174};
		double trinnskatt = 0;

		long brutto = Long.parseLong(showInputDialog("Brutto:"));
		
		if (brutto < trinn[0]) {
			trinnskatt = 0;
		}
		// Regner ut trinnskatten opp til 1.99 mil
		else if (brutto <= trinn[4] && brutto >= trinn[0]) {
			for (var i = 0; i < 4; i++) {
				if (brutto > trinn[i] && brutto <= trinn[i + 1]) {
					trinnskatt += (brutto - trinn[i]) * satser[i];
					break;
				} else {
					trinnskatt += (trinn[i + 1] - trinn[i]) * satser[i];
				}
			}
		} 
		else {
			// Regner ut trinnskatten over 1.99 mill
			// ved å summere trinnskatten opp til 1.99 mill
			// + trinnskatt på beløp over 1.99 mill
			for (var i = 0; i < 4; i++) {
				trinnskatt += (trinn[i + 1] - trinn[i]) * satser[i];
			}
			
			trinnskatt += (brutto - trinn[4]) * satser[4];
		}
		
		System.out.println("Din trinnskatt er: " + trinnskatt);
	}

}