class Bil{
  private String regnr;
  private Motor motor;
  private Hjul hjul;

  public Bil(String regnr, Motor motor, Hjul hjul){
    this.regnr = regnr;
    this.motor = new Motor(motor.getMotornr(), motor.getGirkasse(), motor.getMotortype());
    this.hjul = hjul;
  }

  public String getRegnr(){
    return regnr;
  }
  public Motor getMotor(){
    return motor;
  }
  public Hjul getHjul(){
    return hjul;
  }
  
  public boolean equals(Object obj){
    if(!(obj instanceof Bil)){ // sjekker om objektet ikke er er en bil
      return false;
    }
    if(this == obj){ // Sjekker om du tester den samme som du allerede har valgt
      return false;
    }
    Bil bil = (Bil) obj;
    if(this.getRegnr().equals(bil.getRegnr()) && this.getMotor().getMotornr() == bil.getMotor().getMotornr()){
      return true;
    }
    return false;
  }
}
