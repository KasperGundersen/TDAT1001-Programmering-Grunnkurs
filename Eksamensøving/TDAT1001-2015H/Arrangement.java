class Arrangement{
  private String navn;
  private final Idrettsgrener[] grener;
  private int teller;
  private int maks;

  public Arrangement(String navn, int maks){
    this.navn = navn;
    this.grener = new Idrettsgrener[maks];
    teller = 0;
  }

  public String getNavn(){
    return navn;
  }
  public int getMaks(){
    return maks;
  }
  public String toString(){
    String utskrift = "";
    utskrift += navn + "\n";

    for(int i = 0; i<grener.length; i++){
      utskrift += grener[i].toString() + "\n";
    }
    return utskrift;
  }

  public boolean regGren(Idrettsgrener nyGren){

    if(nyGren == null){
      throw new IllegalArgumentException("Skriv inn gyldig iddrettsgren");
    }
    if(grener.length == teller){
      return false;
    }
    for(int i = 0; i<grener.length; i++){
      if(grener[i].equals(nyGren)){
        return false;
      }
    }
    grener[teller] = new Idrettsgrener(nyGren.getNavn(), nyGren.getMAKS());
    return true;
  }
}
