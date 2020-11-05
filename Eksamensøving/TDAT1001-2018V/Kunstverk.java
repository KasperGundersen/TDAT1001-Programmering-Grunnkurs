class Kunstverk implements java.io.Serializable{
  private String navn;
  private String type;
  private int antKopi;
  private int nrRekke;
  private Navn navnKunstner;

  public Kunstverk(String navn, String type, int antKopi, int nrRekke, Navn navnKunstner){
    this.navn = navn;
    this.type = type;
    this.antKopi = antKopi;
    this.nrRekke = nrRekke;
    this.navnKunstner = navnKunstner;
  }

  public String getNavn(){
    return navn;
  }
  public String getType(){
    return type;
  }
  public int getAntKopi(){
    return antKopi;
  }
  public int getNrRekke(){
    return nrRekke;
  }
  public Navn getNavnKunstner(){
    return navnKunstner;
  }

  public boolean equals(Object obj){
    if(!(obj instanceof Kunstverk)){
      return false;
    }
    if(this == obj){
      return true;
    }

    Kunstverk tempKunst = (Kunstverk) obj;

    if(this.getNavn().equals(tempKunst.getNavn()) || this.getNavnKunstner().equals(tempKunst.getNavnKunstner())){
      return true;
    }
    return false;
  }

  public String toString(){
    return nrRekke + " / " + antKopi + " / " + "¨" + navn + "¨" +  " / " + navnKunstner;
  }
}
