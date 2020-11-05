/*
Øving 8
Program som tar inn en string og returnerer:
antall ord, gjennomsnitlig ordlengde, ny tekst der ordet 'kul' er byttet med 'teit', teksten i store bokstaver

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 8: Oppg.8.16.1 og 8.16.3
*/
import static javax.swing.JOptionPane.*;
class TekstbehandlingKlient{

  public static void main(String[] args){

    String orgOrd = "kul";
    String repOrd = "teit";

    String tekst = showInputDialog("Skriv inn teksten: ");
    Tekstbehandling minTekst = new Tekstbehandling(tekst);

    System.out.println("Antall ord: " + minTekst.antOrd());
    System.out.println("Gjennomsnittlig ordlengde: " + minTekst.gjenSnit());
    System.out.println("Gjennomsnittlig ord per periode: " + minTekst.ordPeriode());
    System.out.println("Ny tekst der ordet " + "'" + orgOrd + "'" + " er byttet med " + "'" + repOrd + "' : " + minTekst.bytte(orgOrd, repOrd));
    System.out.println("Originalteksten: " + tekst);
    System.out.println("Teksten i store bokstaver: " + minTekst.storeBokstaver());
  }
}
