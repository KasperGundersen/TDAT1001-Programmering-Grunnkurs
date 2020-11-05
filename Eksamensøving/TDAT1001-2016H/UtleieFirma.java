class UtleieFirma{
  private String navn;
  private Bil[] leiebiler;
  private final int maksAntBiler;
  private int antBiler;

  public UtleieFirma(String navn, final int maksAntBiler){
    this.navn = navn;
    this.maksAntBiler = maksAntBiler;
    if(maksAntBiler <= 0){
      throw new IllegalArgumentException("Maks antall biler må være en positiv verdi");
    }
    this.leiebiler = new Bil[maksAntBiler];
    antBiler = 0;
  }

  public boolean regBil(Bil nyBil){
    if(nyBil == null){
      return false;
    }
    if(leiebiler.length == antBiler){
      return false;
    }
    for(int i = 0; i<antBiler; i++){
      if(leiebiler[i].equals(nyBil)){
        return false;
      }
    }
    leiebiler[antBiler] = new Bil(nyBil.getRegnr(), nyBil.getMotor(), nyBil.getHjul());
    return true;
  }

  public Bil[] sorter(){
    Bil[] kopi = new Bil[antBiler];

    for(int i = 0; i<antBiler; i++){
      kopi[i] = leiebiler[i];
    }
    int minst;
    for(int i = 0; i<antBiler; i++){
      minst = i;
      for(int k = i+1; k<antBiler; k++){
        if(kopi[i].getRegnr().compareTo(kopi[k].getRegnr()) >0){
          minst = k;
        }
        Bil temp = kopi[i];
        kopi[i] = kopi[minst];
        kopi[minst] = temp;
      }
    }
    return kopi;
  }
}
