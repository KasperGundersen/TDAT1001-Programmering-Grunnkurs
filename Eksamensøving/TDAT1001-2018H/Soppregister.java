class Soppregister{
  private Soppart[] sopparter;
  private int antallReg;

  public Soppregister(int max){
    this.sopparter = new Soppart[max];
  }

  private void utvid(){
    Soppart[] nyListe = New Soppart[sopparter.length + 10];
    for(int i = 0; i<sopparter.length; i++){
      nyListe[i] = new Soppart(sopparter[i].getNavn(), sopparter[i].getBeskrivelse(), sopparter[i].getGiftig());
    }
  }

  public boolean regNySoppart(Soppart sopp){
    if(sopp == null){
      return false;
    }
    for(int i = 0; i<antallReg; i++){
      if(sopparter[i].equals(sopp)){
        return false;
      }
    }
    if(sopparter.length == antallReg)){
      utvid();
    }
    sopparter[antallReg] = new Soppart(sopp);
    antallReg++;
    return true;
  }

  public Soppart[] getMatsopper(){
    Soppart[] matsopper = new Soppart[antallReg];
    for(int i = 0; i<antallReg; i++){
      if(!(sopparter[i].getGiftig())){
        matsopper[i] = new Soppart(sopparter[i]);
      }
    }
    return matsopper;
  }


  public String toString(){
    String message = "";
    message += "Alle registrerte sopparter: \n";

    for(int i = 0; i<antallReg; i++){
      message += (i+1) + ": " + sopparter[i].toString() + "\n";
    }
    return message;
  }

  public String soppSok(String sokeStreng){
    String message = "";
    boolean funnet = false;
    for(int i = 0; i<antallReg; i++){
      if(sopparter[i]finnSopp(sokeStreng)){
        message += sopparter[i].toString() + "\n";
        funnet = true;
      }
    }
    if(!funnet){message += "Feil. Fant ingen sopparter som matchet søkeordet"};
    return message;
  }
}
