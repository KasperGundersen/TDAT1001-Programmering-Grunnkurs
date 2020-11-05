class Soppart{
  private final String navn;
  private final String beskrivelse;
  private final boolean giftig;

  public Soppart(String navn, String beskrivelse, boolean giftig){
    this.navn = navn;
    this.beskrivelse = beskrivelse;
    this.giftig = giftig;
  }

  public Soppart(Soppart soppart){
    this.navn = soppart.getNavn();
    this.beskrivelse = soppart.getBeskrivelse();
    this.giftig = soppart.getGiftig();
  }

  public String getNavn(){
    return navn;
  }

  public String getBeskrivelse(){
    return beskrivelse;
  }
  public boolean getGiftig(){
    return giftig;
  }

  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(obj == null){
      return false;
    }
    if(!(obj instanceof Soppart)){
      return false;
    }

    Soppart sopp = (Soppart)obj;
    if(this.getNavn().equals(sopp.getNavn())){
      return true;
    }
    return false;
  }

  public boolean finnSopp(String sokeStreng){
    if(sokeStreng == null){
      return false;
    }
    if(beskrivelse.indexOf(sokeStreng) >= 0){
      return true;
    }
    return false;
  }

  public String toString(){
    return navn + "\n" + beskrivelse + "\n" + if(giftig)?"Giftig":"Matsopp";
  }
}
