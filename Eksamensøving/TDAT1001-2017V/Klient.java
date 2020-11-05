import static javax.swing.JOptionPane.*;

class Klient{
  public static void main (String[] args){

    String[] muligheter = {"Nytt alfabet","Legg til ord", "Bokstaver ord", "Skriv alfabet til fil", "Skriv alfabetet på skjerm","Sorter alfabetet", "Avslutt"};
    String[] alfa = {"Lese fra fil", "Skriv inn ord"};
    final int NYTT_ALFABET = 0;
  	final int LEGG_TIL_ORD = 1;
  	final int BOKSTAVER_ORD = 2;
  	final int SKRIV_TIL_FIL = 3;
  	final int LIST_ALFATBET = 4;
  	final int SORTER = 5;
  	final int AVSLUTT = 6;

  	int valg = showOptionDialog(null, "Velg", "Eksamen juni 2017", YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);

  Bokstaveringsalfabet ba = null;

  	while (valg != AVSLUTT){
  		switch (valg){
  			case NYTT_ALFABET:
  /* OPPGAVE 2 a) skal inn her */
        int alfaValg = showOptionDialog(null, "Velg", "Eksamen juni 2017", YES_NO_OPTION, INFORMATION_MESSAGE, null, alfa, alfa[0]);
        if(alfaValg == 0){
          String filnavn = showInputDialog("Skriv inn navnet på fila du vil lese fra: ");
          ba = new Bokstaveringsalfabet(filnavn);
        }
        if(alfaValg == 1){
          String alfaNavn = showInputDialog("Skriv inn navnet på det nye alfabetet: ");
          String skilletegn = showInputDialog("Skriv inn skilletegnet: ");
          ba = new Bokstaveringsalfabet(alfaNavn, "", skilletegn);
        }

  			break;
  			case LEGG_TIL_ORD:
        String ord = showInputDialog("Skriv inn ord: ");
        boolean status = ba.regNyttOrd(ord);
        String message = (status)?"Ordet ble lagt til":"Feil. Noe gikk galt";
        showMessageDialog(null, message);
  			break;
  			case BOKSTAVER_ORD:
  					/* OPPGAVE 2 b) skal inn her*/
        String ord2 =showInputDialog("Skriv inn ord du vil ha bokstavert: ");
        showMessageDialog(null, ba.getBokstaver(ord2));
  			break;
  			case SKRIV_TIL_FIL: // ikke en del av oppgaven
  			break;
  			case LIST_ALFATBET:
  			break;
  			case SORTER:
  			break;
  			default: break;
  		}
  valg = showOptionDialog(null, "Velg", "Eksamen juni 2017", YES_NO_OPTION,
   			INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
  	}
  }

}
