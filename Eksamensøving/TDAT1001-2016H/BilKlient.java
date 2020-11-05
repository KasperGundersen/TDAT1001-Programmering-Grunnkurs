import static javax.swing.JOptionPane.*;
class BilKlient{
  int valg = showOptionDialog(null, "Velg operasjon", "Eksamen høst 2016", YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
  String filnavn = showInputDialog("filnavn: ");
  Utleiefirma utleieFirma = lesUtleieFirmaFraFil(filnavn);

  while (valg != AVSLUTT){
    switch (valg){
    case NYTT_FIRMA:
    	// skal ikke fylles ut
    	break;
    case REG_BIL:
    if (utleieFirma != null){
      String regnr = showInputDialog("Skriv inn registreringsnummeret til den nye bilen");
      String motornr = showInputDialog("Skriv motornr");
      String girkasse = showInputDialog("Skriv girkasse");
      String motortype = showInputDialog("Skriv motortype");
      String merke = showInputDialog("Skriv merke");
      String dimensjon = showInputDialog("Skriv dimensjon");
      String dekktype = showInputDialog("Skriv dekktype");

      Motor nyMotor = new Motor(motornr, girkasse, motortype);
      Hjul nyHjul = new Hjul(merke, dimensjon, dekktype);
      boolean nyBil= new Bil(regnr, nyMotor, nyHjul);
      String melding = (nyBil)?"Ny bil ble registrert! :)" : "Ny bil ble ikke registrert! :(";
      showMessageDialog(null, melding);
    	  /* OPPGAVE j) fylles inn her */	}
    	break;
    case LIST_FIRMA:
    if (utleieFirma != null){// skal ikke fylles ut }
    break;
    case LIST_SORTERT:
    if (utleieFirma != null){ // skal ikke fylles ut }
    	break;
    case HENT_SAMME_GIRKASSE:
    if (utleieFirma != null){// skal ikke fylles ut}
    default: break;
  }
  valg = showOptionDialog(null,"Velg operasjon","Eksamen høst 2016", DEFAULT_OPTION, PLAIN_MESSAGE, null, muligheter, muligheter[0]);
  }
}
