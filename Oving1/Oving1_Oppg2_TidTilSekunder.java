// Øving 1 - Oppgave 2
// Omregning fra timer, minutter og sekunder, til totalt antall sekunder.


import static javax.swing.JOptionPane.*;
class Oving1_Oppg2_TidTilSekunder {
	public static void main(String[] args) {
		String timerLest = showInputDialog("Antall timer: ");
		String minutterLest = showInputDialog("Antall minutter: ");
		String sekunderLest = showInputDialog("Antall sekunder: ");
		int timer = Integer.parseInt(timerLest);
		int minutter = Integer.parseInt(minutterLest);
		int sekunder = Integer.parseInt(sekunderLest);
		final int FAKTOR = 60;
		int antallSekunder = timer * FAKTOR * FAKTOR + minutter * FAKTOR + sekunder;
		String utskrift = "Totalt antall sekunder er: " + antallSekunder;
		showMessageDialog(null, utskrift);
	}
} 