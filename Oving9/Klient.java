/*
Øving 9
 * Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
  Øving 9: Oppg. 11.10.1
  Klassen fungerer som brukergrensesnitt for programmet
  Skal ha metoder for hovedmeny, og get- og set-metoder
 
*/
import static javax.swing.JOptionPane.*;
class Klient{

  public static void main(String[] args){
    String[] muligheter = {"Skattetrekk per moned", "bruttolonn", "skattetrekk per or", "tid i bedriften", "Har personen jobbet mer enn..", "Personalia"};
    String[] skattValg = {"Noverenede skattetrekk", "Endre skatt"};
    String fornavn = showInputDialog("Fornavn:");
    String etternavn = showInputDialog("Etternavn:");
    String fodselsorLest = showInputDialog(fornavn + " " + etternavn + "s " + "Fødselsår:");
    int fodselsor = Integer.parseInt(fodselsorLest);
    String arbtakernrLest = showInputDialog(fornavn + " " + etternavn + "s " + "Arbeidstakernummer:");
    int arbtakernr = Integer.parseInt(arbtakernrLest);
    String ansettelseorLest = showInputDialog(fornavn + " " + etternavn + "s " + "Ansettelsesår:");
    int ansettelseor = Integer.parseInt(ansettelseorLest);
    String monedslonnLest = showInputDialog(fornavn + " " + etternavn + "s " + "Månedslønn:");
    int monedslonn = Integer.parseInt(monedslonnLest);
    String skatteprosentLest = showInputDialog("Skatteprosent:");
    int skatteprosent = Integer.parseInt(skatteprosentLest);


    Person person1 = new Person(fornavn, etternavn, fodselsor);
    ArbTaker ansatt1 = new ArbTaker(person1, arbtakernr, ansettelseor, monedslonn, skatteprosent);

    while(true){
      Object meny = showInputDialog(null, "Velg atributt", "Sick ass valg meny", DEFAULT_OPTION, null, muligheter, muligheter[0]);

      if(meny == muligheter[0]){
        int meny1 = showOptionDialog(null, "Velg knapp", "Skattetrekk", 0, PLAIN_MESSAGE, null, skattValg, skattValg[0]);

        switch(meny1){
          case 0:
          System.out.println("Skattetrekk per måned er: " + ansatt1.skattMnd() + " kr");
          break;
          case 1:
          String nyVerdi = showInputDialog("Skriv inn ny verdi");
          double verdi = Double.parseDouble(nyVerdi);
          ansatt1.setSkattetrekk(verdi);
          break;
        }
      }
      else if(meny == muligheter[1]){
        System.out.println("Bruttolønnen er: " + ansatt1.bruttolonn()+ " kr");
      }
      else if(meny == muligheter[2]){
        System.out.println("Skattetrekk i året er: " + ansatt1.skattetrekk() + " kr");
      }
      else if(meny == muligheter[3]){
        System.out.println("Antall år i bedriften er: " + ansatt1.tidBedrift() + " kr ");
      }
      else if(meny == muligheter[4]){
        String grenseLest = showInputDialog("Antall år personen må ha vært ansatt: ");
        int grense = Integer.parseInt(grenseLest);
        System.out.println(fornavn + " " + etternavn + " har jobbet mer enn " + grense + " " + ansatt1.merEnn(grense) );
      }
      else if(meny == muligheter[5]){
        System.out.println(ansatt1.getPersonalia());
      }
      else{
      break;}
    }
  }
}
