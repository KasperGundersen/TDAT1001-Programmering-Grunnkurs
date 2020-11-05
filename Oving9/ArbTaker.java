/**
 * Øving 9
 * Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
  Øving 9: Oppg. 11.10.1
  
    Klassen konstruerer et objekt ArbeidsTager med parametrene navn(datatype Person),
    arbeidstagerNr., ansettelsesår, månedslønn og skatteprosent.
    Klassen skal være mutabel og skal ha både get-metoder for alle attributter, men også set-metoder for de
    attributtene det burde være mulig å forandre.
    Klassen skal også ha metoder som kan gjøre følgende operasjoner:

    Finne ut hvor mange kroner en arbeidstager trekkes i skatt per måned
    Finne bruttolønn per år, altså lønn før skatt
    Finne skattetrekk per år (ingen skatt juni, halv skatt i desember)
    Navn på formen: etternavn, fornavn
    Finne alder
    Finne antall år i bedriften
   	Finne ut om personen har vært ansatt mer enn x antall år, parameter (x)
*/

class ArbTaker{
  public final int arbtakernr;
  public final int ansettelseor;
  public double monedslonn;
  public double skatteprosent;
  private Person personalia;

  static final java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
  static final int or = kalender.get(java.util.Calendar.YEAR);

  public ArbTaker( Person person, int arbtakernr, int ansettelseor, double monedslonn,  double skatteprosent){
    this.arbtakernr = arbtakernr;
    this.ansettelseor = ansettelseor;
    this.monedslonn = monedslonn;
    this.skatteprosent = skatteprosent;
    this.personalia = person;
  }

  public int getArbtakernr(){
    return arbtakernr;
  }
  public int getAnsettelseor(){
    return ansettelseor;
  }
  public double getMonedslonn(){
    return monedslonn;
  }
  public double getSkatteprosent(){
    return skatteprosent;
  }
  public double bruttolonn(){
    return (monedslonn*12);
  }
  public double skattMnd(){
    return monedslonn*(skatteprosent/100);
  }
  public double skattetrekk(){
    return skattMnd()*10.5;
  }
  public int tidBedrift(){
    return or-ansettelseor;
  }
  public boolean merEnn(int grense){
    boolean svar = false;
    if(tidBedrift()>grense){
      svar = true;
    }
    return svar;
  }
  public int getAlder(){
    return or-personalia.getFodselsor();
  }
  public String getPersonalia(){
    System.out.println(this);
    return "Personalia: " + personalia.toString() + " Alderen er " + getAlder() + " år" + ". Arbeidstakernummer: " + arbtakernr;
  }
  public void setSkattetrekk(double verdi){
    skatteprosent = verdi;
  }
}
