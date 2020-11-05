import java.io.*;
class Utstilling implements java.io.Serializable{
  private String navn;
  private Kunstverk[] kunstverk;
  private int teller;
  private int MAKS;
  private String filnavn = "kunstverk.ser";

  public Utstilling(String navn, int MAKS){
    this.navn = navn;
    this.kunstverk = new Kunstverk[MAKS];
    teller = 0;
  }

  public Utstilling(String navn, Kunstverk[] kunstverk1){
    this.navn = navn;
    kunstverk = new Kunstverk[kunstverk1.length];

    for(int i = 0; i<kunstverk1.length; i++){
      kunstverk[i] = new Kunstverk(kunstverk1[i].getNavn(), kunstverk1[i].getType(), kunstverk1[i].getAntKopi(), kunstverk[i].getNrRekke(), kunstverk[i].getNavnKunstner());
    }
  }

  public Kunstverk[] sorter(){
    if(kunstverk.length < 1){
      return kunstverk;
    }

    Kunstverk[] kopi = new Kunstverk[teller];
    for(int i = 0; i<kunstverk.length; i++){
      kopi[i] = new Kunstverk(kunstverk[i].getNavn(), kunstverk[i].getType(), kunstverk[i].getAntKopi(), kunstverk[i].getNrRekke(), kunstverk[i].getNavnKunstner());
    }

    int minst;

    for(int i = 0; i<kunstverk.length; i++){
      minst = i;
      for(int k = i+1; k<kunstverk.length; i++){
        if(kopi[i].getNavn().compareTo(kopi[k].getNavn()) > 0){
          minst = k;
        }
      }

      Kunstverk temp = kopi[i];
      kopi[i] = kopi[minst];
      kopi[minst] = temp;
    }
    return kopi;
  }

  public String toString(){
    String utskrift = "";
    utskrift += navn + "\n" + "Kunstobjekter på utstillingen: " + "\n";

    for(int i = 0; i<kunstverk.length; i++){
      utskrift += kunstverk[i].toString();
    }
    return utskrift;
  }

  public boolean leseFil(String filnavn){
    try (FileOutputStream fos = new FileOutputStream(filnavn);
      ObjectOutputStream oos = new ObjectOutputStream(fos);){
        oos.writeObject(new Integer(teller));
        oos.writeObject(kunstverk);
        return true;
    }catch (IOException e){
      e.printStackTrace();
      System.out.println("IOException");
    }
    return false;
  }
}
