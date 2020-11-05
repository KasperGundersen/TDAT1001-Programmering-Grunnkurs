/*
Øving 5
Program som lar deg opprette brøker og regne med disse

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 5: Oppg. 6.10.2 og 6.10.3

*/

import static javax.swing.JOptionPane.*;
class Brokregning{

  private int teller;
  private int nevner;

  public Brokregning(int teller, int nevner){
    this.teller = teller;
    this.nevner = nevner;

    if(nevner==0){
      throw new IllegalArgumentException("Nevner er 0, ugyldig verdi!!! ");
    }
  }
  public Brokregning(int teller){
    this.teller = teller;
    this.nevner = 1;
  }
  public int getTeller(){
    return teller;
  }
  public int getNevner(){
    return nevner;
  }
  public void sum(Brokregning brok){
    teller = teller*brok.getNevner() + brok.getTeller()*nevner;
    nevner *= brok.getNevner();
  }
  public void substraksjon(Brokregning brok){
    teller = teller*brok.getNevner() - brok.getTeller()*nevner;
    nevner *= brok.getNevner();
  }

  public void multiplisere(Brokregning brok){
    teller *= brok.getTeller();
    nevner *= brok.getNevner();
  }
  public void divisjon(Brokregning brok){
    teller *= brok.getNevner();
    nevner *= brok.getTeller();
  }

  public String toString(){
    return teller + "/" + nevner;
  }
  public static void main(String[] args){
    //final double TOLERANSE == 0.001;
    System.out.println("Det er totalt 4 tester");

    Brokregning brok1 = new Brokregning(1,2);
    Brokregning brok2 = new Brokregning(1,5);
    brok1.sum(brok2);

    if(brok1.toString().equals("7/10")){
      System.out.println("Test 1 vellykket");
    }
    brok1 = new Brokregning(1,2);
    brok2 = new Brokregning(1,5);
    brok1.substraksjon(brok2);

    if(brok1.toString().equals("3/10")){
      System.out.println("Test 2 vellykket");
    }
    brok1 = new Brokregning(1,2);
    brok2 = new Brokregning(1,5);
    brok1.multiplisere(brok2);

    if(brok1.toString().equals("1/10")){
      System.out.println("Test 3 vellykket");
    }
    brok1 = new Brokregning(1,2);
    brok2 = new Brokregning(1,5);
    brok1.divisjon(brok2);

    if(brok1.toString().equals("5/2")){
      System.out.println("Test 4 vellykket");
    }
  }
}
