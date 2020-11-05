import static javax.swing.JOptionPane.*;
import java.io.*;
class Arrangement_klient{
  public static void main(String[] args){
    String valgLest = showInputDialog("Skriv inn det tallet som tilsvarer den kommandoen du ønsker å gjøre: "
    + "\n" + "1) Opprett nytt Arrangement" + "\n" + "2) Registrere ny iddrettsgren" + "\n" + "3) Avslutt");
    int valg = Integer.parseInt(valgLest);
    if(valg != 1 && valg !=2 && valg !=3 ){
      throw new IllegalArgumentException("Skriv inn 1, 2, eller 3 ditt nekhull!!");
    }
    Arrangement a = null;
    while(valg != 3){
      switch(valg){
        case 1:
        if(a != null){
          String svar = showInputDialog("ARRANGEMENTET ER REGISTRERT FRA FØR AV." + "\n" +
          "OM DU FORTSETTER VIL ALL DATA FRA DET TIDLIGERE ARRANGEMENTET BLI SLETTET!!" + "\n" +
           " Skriv 1 for JA eller 2 for NEI");
           int svarTall = Integer.parseInt(svar);
           if(svarTall != 1 && svarTall != 2){
             throw new IllegalArgumentException("Skriv JA eller NEI");
           }
           if(svarTall == 2){
             break;
           }
        }
        String ArrangNavn = showInputDialog("Hva heter det nye Arrangement du vil lage?");
        String ArrangMaks = showInputDialog("Skriv inn maks antall iddrettsgrener arrangementet kan ha: ");
        int maksLest = Integer.parseInt(ArrangMaks);
        a = new Arrangement(ArrangNavn, maksLest);
        break;
        case 2:
        String navnGren = showInputDialog("Skriv inn navnet på den grenen du vil legge til: ");
        String antGrener = showInputDialog("Skriv inn antall Øvelser grenen skal ha: ");
        int antallGrener = Integer.parseInt(antGrener);
        if(navnGren == null || antGrener == null || antallGrener <1){
          showMessageDialog(null, "FEIL DIN NISSE!!");
        }
        Idrettsgrener nyGren = new Idrettsgrener(navnGren, antallGrener);
        break;
        case 3:
        return;
      }
      valgLest = showInputDialog("Skriv inn det tallet som tilsvarer den kommandoen du ønsker å gjøre: "
      + "\n" + "1) Opprett nytt Arrangement" + "\n" + "2) Registrere ny iddrettsgren" + "\n" + "3) Avslutt");
    }
  }

  public static Arrangement leseFraFil(String filnavn){
    try (FileReader leseForbindelseFil = new FileReader(filnavn);
      BufferedReader leseFil = new BufferedReader(leseForbindelseFil);){
      leseFil.close();
    }catch (FileNotFoundException e){
      e.printStackTrace();
    }catch (IOException e){
      e.printStackTrace();
    }
    return null;
  }
}
