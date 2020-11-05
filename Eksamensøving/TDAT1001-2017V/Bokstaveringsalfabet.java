import java.io.*;

class Bokstaveringsalfabet{
  private String navn;
  private String[] alfabet;

  public Bokstaveringsalfabet(String navn, String alfabet, String skilletegn){
    this.navn = navn;
    this.alfabet = alfabet.split(skilletegn);
  }

  public Bokstaveringsalfabet(String filnavn){
    this.navn = filnavn.split(".")[0];
    this.alfabet = lesAlfabetFraFil(filnavn);
  }

  public String toString(){
    String alfa = ";";
    for(int i = 0; i<alfabet.length; i++){
      alfa += alfabet[i] + " ";
    }
    return alfa;
  }

  public void utvid(){
    String[] ny = new String[alfabet.length +1];
    for(int i = 0; i<alfabet.length; i++){
      ny[i] = alfabet[i];
    }
    alfabet = ny;
  }

  public boolean regNyttOrd(String ord){
    for(int i = 0; i<alfabet.length;i++){
      if(alfabet[i].toLowerCase().charAt(0) == ord.toLowerCase().charAt(0)){
        return false;
      }
    }
    utvid();
    alfabet[alfabet.length-1] = ord;
    return true;
  }

  public boolean endreOrd(String ord, String nyttOrd){
    if(ord == null || nyttOrd == null){
      return false;
    }
    if(!(nyttOrd.toLowerCase().charAt(0) == ord.toLowerCase().charAt(0))){
      return false;
    }
    for(int i = 0; i<alfabet.length;i++){
      if(alfabet[i].toLowerCase().charAt(0) == ord.toLowerCase().charAt(0)){
        alfabet[i] = nyttOrd;
        return true;
      }
    }
    return false;
  }

  public void sorter(){
    for(int i = alfabet.length -1;i>1; i--){
      for(int k = 0; k<i; k++){
        if(alfabet[k].compareTo(alfabet[k+1]) >0){
          String temp = alfabet[k];
          alfabet[k] = alfabet[k+1];
          alfabet[k+1] = temp;
        }
      }
    }
  }

  public String getBokstaver(String setning){
    String[] liste = setning.split("");
    String message = setning.toUpperCase() + ": ";

    for(int i = 0; i<liste.length; i++){
      boolean finner = false;
      for(int k = 0; k<liste.length; k++){
        if(liste[i].toUpperCase().charAt(0) == alfabet[k].toUpperCase().charAt(0)){
          message += alfabet[k] + " ";
          finner = true;
          break;
        }
      }
      if(finner == false){
        message += "Ukjent ";
      }
    }
    return message;
  }
  public boolean skriveTilFil(String filnavn, String skilletegn){
    try{
    FileWriter skriveForbindelse = new FileWriter(filnavn, false);
    PrintWriter skriver = new PrintWriter(new BufferedWriter(skriveForbindelse));
    skriver.println(skilletegn);
    for(int i = 0; i<alfabet.length; i++){
      skriver.println(alfabet[i] + skilletegn);
    }
    skriver.close();
    return true;
  } catch (Exception e){
      e.printStackTrace();
      System.out.println("Noe gikk galt");
      return false;
    }
  }

  public String[] lesAlfabetFraFil(String filnavn){
    try{
    FileReader leseforbindelse = new FileReader(filnavn);
    BufferedReader leser = new BufferedReader(leseforbindelse);
    String skilletegn = leser.readLine();
    String[] alfa = leser.readLine().split(skilletegn);
    leser.close();
    return alfa;
  }catch(FileNotFoundException e){
      e.printStackTrace();
      System.out.println("ClassNotFoundException");
      return null;
    }catch(IOException e){
        e.printStackTrace();
        System.out.println("IOException");
        return null;
  }
}
