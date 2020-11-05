class Ord{

  // a) Objektvariabler
  private String ord;
  private String[] definisjon;
  // b) konstruktør
  public Ord(String ord, String[] definisjon){
    this.ord = ord;
    this.definisjon = definisjon;
  }
  // c) tilgangsmetoder
  public String getOrd(){
    return ord;
  }

  public String[] getDefinisjon(){
    return definisjon;
  }

  // d) Sjekke om to ord er like. Bruker equals( Object obj)
  public boolean equals(Object obj){
    if(!(obj instanceof Ord)){
      return false; //RETURN. Raskt uthopp hvis feil objektstype
    }
    if(this == obj){
      return false;
    }

    Ord nyttOrd = (Ord) obj;
    return (ord.equals(nyttOrd.ord));

  }
  // e) klassens toString medotde
  public String toString(){

    String utskrift = "";
    utskrift+= getOrd() + ":";

    for(int i=0; i<definisjon.length; i++){
      utskrift+= (i+1) + ". " + definisjon[i];
    }
    return utskrift;
  }
  // f) utvide tabell, lager en kopi som er én plass større og så fyller den med alled de verdiene til den orginale tabellen
  private void utvidTabell(){
    String[] nyTabell = new String[definisjon.length + 1];
    for(int i = 0; i<definisjon.length; i++){
      nyTabell[i] = definisjon[i];
    }
    definisjon = nyTabell;
  }
  // g) legger til definisjon. Sjekker om den er registrert fra før av.
  // Deretter utvider jeg tabellen og legger den på siste plassen
  public boolean leggTilDefinisjoner(String nyDefinisjon){

    for(int i = 0; i<definisjon.length; i++){
      if(definisjon[i].equals(nyDefinisjon)){
        return false;
      }
    }

    utvidTabell();
    definisjon[definisjon.length - 1] = nyDefinisjon;
    return true;
  }
  public int compareTo(Ord tempOrd){
    return this.getOrd().compareTo(tempOrd.getOrd());
  }
}
