package filer;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO3 {
	
	public static void main(String[] args) { 
		// Beregener n! for 1 <= n <= 20
		long tall = Long.parseLong(showInputDialog("Skriv inn et positivt heltall"));
		long resultat = 1;	
		for (var i = 1; i <= tall; i++) {
			resultat *= i;
		}
		if (tall > 0) {
			System.out.println(tall + "! = " + resultat);
		}
		else {
			System.out.println("Tallet må være større enn 0");
		}
	}
	
}