class Idrettsgrener{
  private String navn;
  private final Ovelse[] ovelse;
  private int teller;
  private int MAKS;

  public Idrettsgrener(String navn, int MAKS){
    this.navn = navn;
    this.ovelse = new Ovelse[MAKS];
    teller = 0;
  }

  public Idrettsgrener(String navn, Ovelse[] ovelse1){
    this.navn = navn;
    ovelse = new Ovelse[ovelse1.length];
    for(int i = 0; i<ovelse1.length; i++){
      ovelse[i] = new Ovelse(ovelse1[i].getBeskrivelse(), ovelse1[i].getKjonn());
    }
  }

  public String getNavn(){
    return navn;
  }
  public int getMAKS(){
    return MAKS;
  }

  public String toString(){
    String utskrift = "";
    utskrift += navn + "\n";
    for(int i = 0; i<ovelse.length; i++){
      utskrift += ovelse[i].toString() + "\n";
    }
    return utskrift;
  }

  public boolean regOvelse(Ovelse nyOvelse){
    if(nyOvelse == null){
      throw new IllegalArgumentException("Skriv inn beskrivelse og kjønn er du snill :)");
    }
    if(ovelse.length == teller){
      return false;
    }
    for(int i = 0; i<ovelse.length; i++){
      if(ovelse[i].equals(nyOvelse)){
        return false;
      }
    }
    ovelse[teller] = new Ovelse(nyOvelse.getBeskrivelse(), nyOvelse.getKjonn());
    return true;
  }
}
