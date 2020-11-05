/*
Øving 8
Program som tar inn en string og returnerer:
antall ord, gjennomsnitlig ordlengde, ny tekst der ordet 'kul' er byttet med 'teit', teksten i store bokstaver

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 8: Oppg.8.16.1 og 8.16.3
*/
class Tekstbehandling{
  public String tekst;

  public Tekstbehandling(String tekst){
  this.tekst = tekst;
  }
  public int antOrd(){
    String[] ord = tekst.split(" ");
    String utskrift = "";
    int totOrd = ord.length;

    return totOrd;
  }
  public int gjenSnit(){
    String[] ord = tekst.split(" ");
    int gjennomsnitt = 0;
    int antBokstaver = 0;
    for(int i=0; i<ord.length; i++){
      antBokstaver += ord[i].length();
    }
    gjennomsnitt = antBokstaver/ord.length;
    return gjennomsnitt;
  }
  public int ordPeriode(){
    String[] ord = tekst.split(" ");
    String[] periode = tekst.split("[.?!:]");
    int ordPeriode = 0;
    int antPeriode = periode.length;

    ordPeriode = antOrd()/antPeriode;
    return ordPeriode;
  }
  public String bytte(String orgOrd, String repOrd){
    return tekst.replace(" " + orgOrd+ " " ,repOrd);
  }
  public String storeBokstaver(){
    tekst = tekst.toUpperCase();
    return tekst;
  }
}
