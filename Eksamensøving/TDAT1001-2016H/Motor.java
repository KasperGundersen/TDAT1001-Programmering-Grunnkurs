class Motor{
    private final int motornr;
    private final String girkasse;
    private final String motortype;

    public Motor(final int motornr, final String girkasse, final String motortype){
      this.motornr = motornr;
      this.girkasse = girkasse;
      this.motortype = motortype;
    }

    public int getMotornr(){
      return motornr;
    }
    public String getGirkasse(){
      return girkasse;
    }
    public String getMotortype(){
      return motortype;
    }

    public String toString(){
      return "Motornr: " + motornr + " Girkasse: " + girkasse + " Motortype: " + motortype;
    }
}
