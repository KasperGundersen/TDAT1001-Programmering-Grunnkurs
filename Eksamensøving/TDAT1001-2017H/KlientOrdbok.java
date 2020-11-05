import static javax.swing.JOptionPane.*;
class KlientOrdbok{
  public static void main(String[] args){
  String[] muligheter = {"Legg til ord", "Legg til definisjon", "Avslutt"};
  final int LEGG_TIL_ORD = 0;
  	final int LEGG_TIL_DEFINISJON = 1;
  	final int AVSLUTT = 2;
  	int valg = showOptionDialog(null, "Velg", "Eksamen des 2017",  YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
  String navn = "Ordboka";
  Ordbok ordbok = new Ordbok(navn, 10);
  while (valg != AVSLUTT){
  		switch (valg){
  			case LEGG_TIL_ORD:
        String Ord = showInputDialog("Skriv inn det nye ordet: ");
        String[] tulleTabell = new String[1];
        Ord nyttOrd = new Ord(Ord, tulleTabell);
        boolean status = ordbok.regNyttOrd(nyttOrd);
        String message = (status)? "Ordet ble registrert!" : "Feil! Ordet ble ikke registrert, eller finnes fra før av!" ;
        showMessageDialog(null, message);
  			break;
  			case LEGG_TIL_DEFINISJON:
        String velgOrd = showInputDialog("Skriv inn hvilket ord du vil legge til definisjon: ");
        String nyDef = showInputDialog("Skriv inn ny definisjon: ");
        boolean status1 = ordbok.leggTilDef(velgOrd, nyDef);
        String message1 = (status1)?"Ny definisjon ble registrert!" : "Ny definisjon ble ikke registrert, eller er registrert fra før av";
        showMessageDialog(null, message1);
  			break;
  			default: break;
  		}
  	valg = showOptionDialog(null, "Velg", "Eksamen des 2017", YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
  	}
  }
}
