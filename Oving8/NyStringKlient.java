/*
Øving 8
Program som tar inn en string og kan enten lage en forkortelse av ordet, dvs første bokstav av hvert ord i strengen
eller fjerner en gitt bokstav fra strengen og erstatte den med mellomrom

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 8: Oppg.8.16.1 og 8.16.3
*/
import static javax.swing.JOptionPane.*;
class NyStringKlient{

  public static void main(String[] args){
    String tegn = "e";
    String tekst = showInputDialog("Skriv inn teksten: ");
    NyString minTekst = new NyString(tekst);

    System.out.println("Forkortelse av ordet: " + minTekst.splitt());
    System.out.println("Fjerning av tegnet " + tegn + " gir: " + minTekst.fjern(tegn));
  }
}
