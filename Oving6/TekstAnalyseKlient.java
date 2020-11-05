/*
Øving 6
Program som tar inn en string og analysrer ulike deler ved den. Blant annet:
antall ulike bokstaver, totalt antall bokstaver, antall A, lengde tekst, bokstaven det er mest av

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 6 : Oppg. 7.8.1 og 7.8.3

*/
import static javax.swing.JOptionPane.*;
public class TekstAnalyseKlient {

  public static void main(String[] args){
    String tekst = showInputDialog("Skriv inn teksten: ");
    Tekst minTekst = new Tekst(tekst);

    System.out.println("Ulike bokstaver: " + minTekst.ulikeBokstaver());
    System.out.println("Antall bokstaver: " + minTekst.totBokstaver());
    System.out.println("Prosent ikke bokstaver: " + String.format("%.2f", minTekst.prosBokstaver()));
    System.out.println("Antall A: " + minTekst.forKomBokstav('A'));
    System.out.println("Lengde tekst: " + tekst.length());
    System.out.println("Bokstaven det er mest av: " + minTekst.mestBokstav());

  }
}
