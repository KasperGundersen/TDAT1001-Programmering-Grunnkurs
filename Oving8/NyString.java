/*
Øving 8
Program som tar inn en string og kan enten lage en forkortelse av ordet, dvs første bokstav av hvert ord i strengen
eller fjerner en gitt bokstav fra strengen og erstatte den med mellomrom

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 8: Oppg.8.16.1 og 8.16.3
*/
class NyString{
  private String tekst;

  public NyString(String tekst){
  this.tekst = tekst;
  }
  public String splitt(){
    String[] ord = tekst.split(" ");
    String utskrift = "";
    for(int i=0; i< ord.length; i++){
      utskrift += ord[i].charAt(0);
    }
    return utskrift;
  }
  public String fjern(String bokstav){
    tekst = tekst.replace(bokstav, "");
    if(bokstav.length()>1){
      throw new IllegalArgumentException("Kan bare bytte ut én bokstav om gangen");
    }
    return tekst;
  }
}
