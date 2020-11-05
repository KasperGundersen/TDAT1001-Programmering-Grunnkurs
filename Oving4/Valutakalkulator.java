/*
Øving 4
Program som lager ulike valutaer og deretter lar deg konvertere mellom de og norske kroner
Først velger du valuter du vil regne om til norske kroner, 
så velger du hvilken valuta du vil konverte fra norske kroner til


Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 4: Oppg. 5.9.2 og 5.9.3

*/


import static javax.swing.JOptionPane.*;
class Valuta{
    private final double verdi;
    private final String navn;

    public Valuta(String navn, double verdi){
        this.verdi = verdi;
        this.navn = navn;
    }

    public double tilKr(double mengde){
        return mengde*verdi;
    }
    public double fraKr(double mengde){
        return mengde/verdi;
    }
}

public class Valutakalkulator{
    public static void main(String[] args){

        Valuta USD = new Valuta("Amerikanske Dollar", 8.21);
        Valuta EUR = new Valuta("Euro", 9.57);
        Valuta SEK = new Valuta("Svenske kroner", 0.914);

        String hvilkeValuta = showInputDialog("Velg en valutta du vil konvertere fra: \n 1: dollar \n 2: Euro \n 3: Svenske kroner");
        int tall = Integer.parseInt(hvilkeValuta);
        String navnPaaValuta[] = new String[]{"Dollar", "Euro", "Svenske kroner"};
        String mengdeLest = showInputDialog("Hvor mange " + navnPaaValuta[tall-1] + ":");
        double mengde = Double.parseDouble(mengdeLest);

        while(true){

			switch(tall){
				case 1:
				showMessageDialog(null, "Verdi i norske kroner: " + USD.tilKr(mengde));
				break;
				case 2:
				showMessageDialog(null, "Verdi i norske kroner: " + EUR.tilKr(mengde));
				break;
				case 3:
				showMessageDialog(null, "Verdi i norske kroner: " + SEK.tilKr(mengde));
			}

			hvilkeValuta = showInputDialog("Velg en valutta du vil konvertere til: \n 1: dollar \n 2: Euro \n 3: Svenske kroner");
			tall = Integer.parseInt(hvilkeValuta);
			mengdeLest = showInputDialog("Hvor mange NOK: ");
			mengde = Double.parseDouble(mengdeLest);

			switch(tall){
				case 1:
				showMessageDialog(null, "Verdi i Amerikanske Dollar: " + USD.fraKr(mengde));
				break;
				case 2:
				showMessageDialog(null, "Verdi i Euro: " + EUR.fraKr(mengde));
				break;
				case 3:
				showMessageDialog(null, "Verdi i svenske kroner: " + SEK.fraKr(mengde));
			}
		}
	}
}
