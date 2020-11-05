class Hjul{
  private final String merke;
  private final String dimensjon;
  private final String dekktype;

  public Hjul(final String merke, final String dimensjon, final String dekktype){
    this.merke = merke;
    this.dimensjon = dimensjon;
    this.dekktype = dekktype;
  }

  public String getMerke(){
    return merke;
  }
  public String getDimensjon(){
    return dimensjon;
  }
  public String getDekktype(){
    return dekktype;
  }

  public String toString(){
    return "Merke: " + merke + " Dimensjon: " + dimensjon + " Dekktype: " + dekktype;
  }
}
