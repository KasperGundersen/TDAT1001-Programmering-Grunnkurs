/*
Øving 7
Et eller annet program med temperaturer

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 7: Oppg. 9.11.2 og 10.9.1
*/

class Temperaturer{
  private double[][] tempTabell;
  private int dager;
  private int timer;


  public Temperaturer(double[][] tempTabell){
    this.dager = tempTabell.length;
    this.timer = tempTabell[0].length;
    this.tempTabell = tempTabell;
  }
  public double[] midDag(){
    double sum = 0;
    double[] gjennomsnittDag = new double[dager];
    for(int i=0; i<tempTabell.length; i++){
      sum = 0;
      for(int x = 0; x<tempTabell[i].length; x++){
        sum += tempTabell[i][x];
      }
      gjennomsnittDag[i] += sum/tempTabell[i].length;
    }
    return gjennomsnittDag;
  }


  public double[] midTimeMoned(){
    double sum = 0;
    double[] gjennomsnittTimeMoned = new double[timer];
    for(int x=0; x<tempTabell[0].length; x++){
      sum = 0;
      for(int i = 0; i<tempTabell.length; i++){
        sum += tempTabell[i][x];
      }
      gjennomsnittTimeMoned[x] += sum/tempTabell.length;
    }
    return gjennomsnittTimeMoned;
  }
  public double midMåned(){
    double sum = 0;
    for(int x=0; x<tempTabell[0].length; x++){
      for(int i = 0; i<tempTabell.length; i++){
        sum += tempTabell[i][x];
      }
    }
    return sum/(tempTabell.length*tempTabell[0].length);
  }
  public double dagerMedIntervall(int l){

    int[] dagNr = new int[5];
    double[] dager = midDag();

    for(int i=0; i<tempTabell.length; i++){
      double dag = dager[i];

      if(dag<-5){
         dagNr[0]++;
      }
      else if(dag>-5 && dag<=0){
        dagNr[1]++;
      }
      else if(dag>0 && dag<=5){
        dagNr[2]++;
      }
      else if(dag>5 && dag<=10){
        dagNr[3]++;
      }
      else if(dag>10){
        dagNr[4]++;
      }
    }
    return dagNr[l];
  }
}
