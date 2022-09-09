package filer;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveB5 {

	public static void main(String[] args) {

		int[] grenser = { 0, 40, 50, 60, 80, 90, 10110 };
		String[] karakter = { "F", "E", "D", "C", "B", "A" };
		String karakterOut = "";

		boolean gyldig = true;

		for (int j = 1; j <= 10; j++) {
			int poengsum = Integer.parseInt(showInputDialog("Poengsum:"));
			// Om poengsummen er utenfor området så gir den error og en ny input helt til du
			// taster riktig
			// når du har tastet riktig kjører den samme for løkke som under else for å beregne
			// karakter
			if (poengsum < 0 || poengsum > 100) {
				gyldig = false;
				while (!gyldig) {
					System.out.println("Ugyldig poengsum");
					poengsum = Integer.parseInt(showInputDialog("Tast inn en gyldig poengsum (0 - 100):"));
					if (poengsum >= 0 && poengsum <= 100) {
						gyldig = true;
						for (int i = 0; i < grenser.length; i++) {
							if (poengsum >= grenser[i] && poengsum < grenser[i + 1]) {
								karakterOut = karakter[i];
								System.out.println(j + ": " + karakterOut);
							}
						}
					}
				}

			} else {
				for (int i = 0; i < grenser.length; i++) {
					if (poengsum >= grenser[i] && poengsum < grenser[i + 1]) {
						karakterOut = karakter[i];
						System.out.println(j + ": " + karakterOut);
						
					}
				}
			}
		}
	}
}