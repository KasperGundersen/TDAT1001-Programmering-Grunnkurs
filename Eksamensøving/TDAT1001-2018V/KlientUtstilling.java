import static javax.swing.JOptionPane.*;
class KlientUtstilling{
  public static void main(String[] args){
    String valg = showInputDialog("Skriv inn det tallet som tilsier det valget du ønsker å ta: " + "\n"
    + "1) List alle kunstverk \n 2) Legg til nytt kunstverk \n 3) Avlsutt");
    int valgLest = Integer.parseInt(valg);
    if(valgLest != 1 && valgLest != 2 && valgLest != 3){
      throw new IllegalArgumentException("Du må skrive inn enten 1, 2 eller 3!!!")
    }
    Utstilling nyUtstilling = new Utstilling(navn, maks);
    while(valgLest != 3){
      switch (valgLest){
        case 1:
        for()
        showMessageDialog(null, Utstilling.toString());
        break;
        case 2:
        String navn = showInputDialog("Hva heter det nye kunstverket? ");
        String type = showInputDialog("Hva type kunstverk er det? ");
        String antKopi = showInputDialog("Hvor mange kopier finnes det av kunstverket? ");
        int antKopiLest = Integer.parseInt(antKopi);
        String nrRekke = showInputDialog("Hvilket nummer i rekka er dette kunstverket? ");
        int nrRekkeLest = Integer.parseInt(nrRekke);
        String navnKunstner = showInputDialog("Hva heter kunstneren? ");
        Navn navnKunstnerLest = (Navn) navnKunstner;

        Kunstverk nyttKunstverk = new Kunstverk(navn, type, antKopiLest, nrRekkeLest, navnKunstnerLest);
        break;
        case 3: break;
      }
      valg = showInputDialog("Skriv inn det tallet som tilsier det valget du ønsker å ta: " + "\n"
      + "1) List alle kunstverk \n 2) Legg til nytt kunstverk \n 3) Avlsutt");
      valgLest = Integer.parseInt(valg);
    }
  }
}
