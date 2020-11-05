class Ovelse{
  private String beskrivelse;
  private String kjonn;

  public Ovelse(String beskrivelse, String kjonn){
    this.beskrivelse = beskrivelse;
    this.kjonn = kjonn;
  }

  public String getBeskrivelse(){
    return beskrivelse;
  }
  public String getKjonn(){
    return kjonn;
  }

  public String toString(){
    return beskrivelse + " " + kjonn;
  }

  public boolean equals(Object obj){
    if(!(obj instanceof Ovelse)){
      return false;
    }
    if(this == obj){
      return false;
    }
    if(obj == null){
      return false;
    }
    Ovelse nyOvelse = (Ovelse) obj;
    if(nyOvelse.getBeskrivelse().equals(beskrivelse) && nyOvelse.getKjonn().equals(kjonn)){
      return true;
    }
    return false;
  }
}
