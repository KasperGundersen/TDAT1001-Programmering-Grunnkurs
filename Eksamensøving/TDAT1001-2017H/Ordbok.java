import java.io.*;
import java.lang.Object.*;
class Ordbok implements java.io.Serializable{
  private String ordbokNavn;
  private Ord[] ordbok;
  private int antallReg;
  private final int MAKS_ANTALL_ORD = 10;
  private String filnavn = "ordliste.ser";

  // a) konstruktør som skal endre antallReg og lengden på ordbok om lesing fra fil går galt
  public Ordbok(String ordbokNavn, int MAKS_ANTALL_ORD){
    this.ordbokNavn = ordbokNavn;
    
    boolean status = lesOrdbokFraFil(filnavn);
    if(!status){
      ordbok = new Ord[MAKS_ANTALL_ORD];
      antallReg = 0;
    }
  }
  // b) registrerer nytt ordet
  public boolean regNyttOrd(Ord ord){
    if(ordbok.length == antallReg){
      return false;
    }
    for(int i = 0; i<antallReg; i++){
      if(ordbok[i].equals(ord)){
        return false;
      }
    }
    ordbok[antallReg] = new Ord(ord.getOrd(), ord.getDefinisjon());
    antallReg++;
    return true;
  }
  // c) legg til definisjon. uansett om det er reg fra før av
  public boolean leggTilDef(String ord, String definisjon){
    Ord ordet = getOrd(ord);
    if(ordet == null){
      return false;
    }
    return ordet.leggTilDefinisjoner(definisjon);
  }
  //e) søke metode. REturnerer ordet om det finnes, om ikke returnrerer Null
  public Ord getOrd(String sokeStreng){
    for(int i = 0; i<antallReg; i++){
      if(sokeStreng.equals(ordbok[i].getOrd())){
          return ordbok[i];
      }
    }
    return null;
  }

  public Ord[] sorter(){
    Ord[] kopi = new Ord[antallReg];
    for(int i = 0; i<antallReg; i++){
      kopi[i] = new Ord(ordbok[i].getOrd(), ordbok[i].getDefinisjon());
    }

    if(kopi.length <= 1){
      return kopi;
    }

    for(int i = 0; i<kopi.length; i++){
      int minst = i;
      for(int j = 0; j<kopi.length; j++){
        if(kopi[i].compareTo(kopi[j])>0){
          minst = j;
        }
        Ord temp = kopi[i];
        kopi[i] = kopi[minst];
        kopi[minst] = temp;
      }
    }
    return kopi;
  }
  // f) lese fra fil. Et helvetes styr

  public boolean lesOrdbokFraFil(String filnavn){
    try (FileInputStream leseForbindelseFil = new FileInputStream(filnavn);) {
    ObjectInputStream leseFil = new ObjectInputStream(leseForbindelseFil);
    Ord[] ordTabell = (Ord[]) leseFil.readObject();
    leseFil.close();
    int teller = 0;
    for(int i =0; i<ordTabell.length; i++){
      if(ordTabell[i] != null){
        teller++;
      }
    }
    antallReg = teller;
    ordbok = ordTabell;
    return true;


    } catch (FileNotFoundException e){
      e.printStackTrace();
      System.out.println("Fant ikke filen");
      return false;
    } catch (IOException e){
      e.printStackTrace();
      System.out.println("IOException");
      return false;
    }  catch (SecurityException e){
      e.printStackTrace();
      System.out.println("SecurtyExeption");
      return false;
    } catch(NullPointerException e){
      e.printStackTrace();
      System.out.println("NullPointerExeption");
      return false;
    } catch(ClassNotFoundException e){
      e.printStackTrace();
      System.out.println("ClassNotFoundException");
      return false;
    }
  }
}
