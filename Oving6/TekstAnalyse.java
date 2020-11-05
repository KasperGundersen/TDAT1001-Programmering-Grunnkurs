/*
Øving 6
Program som tar inn en string og analysrer ulike deler ved den. Blant annet:
antall ulike bokstaver, totalt antall bokstaver, antall A, lengde tekst, bokstaven det er mest av

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 6 : Oppg. 7.8.1 og 7.8.3

*/
import static javax.swing.JOptionPane.*;
public class TekstAnalyse{
  String tekst;
  int[] antallTegn = new int[30];
  int ulikeBokstaver = 0;
  int totBokstaver = 0;
  double prosBokstaver = 0;
  double prosent = 0;

  public Tekst(String tekst){
    tekst = tekst.toUpperCase();
    this.tekst = tekst;
    metode();
  }

  public void metode(){
    for(int i=0; i<tekst.length(); i++){
      char tegn = tekst.charAt(i);
      int verdi = tegn;
      if(65<=verdi && verdi<=90){
        antallTegn[verdi-65]++;
      }
      else if(verdi==198){
        antallTegn[26]++;
      }
      else if(verdi==216){
        antallTegn[27]++;
      }
      else if(verdi==197){
        antallTegn[28]++;
      }
      else{
        antallTegn[29]++;
      }
    }
  }
  
  public int[] finnTegn(){
    return antallTegn;
  }

  public int ulikeBokstaver(){
    for(int i=0; i<29; i++){
      if(antallTegn[i]!=0){
        ulikeBokstaver++;
      }
    }
    return ulikeBokstaver;
  }
  public int totBokstaver(){
    totBokstaver = 0;
    for(int i=0; i<29; i++){
       totBokstaver += antallTegn[i] ;
     }
     return totBokstaver;
  }

  public double prosBokstaver(){
      double prosent;
      //double lengde = antallTegn[i] ;
      prosent = 100-((double)(totBokstaver())/(double)(tekst.length()))*100;
      return prosent;
    }
  public int forKomBokstav(char A){
    int x = A-65;
     return antallTegn[x];
    }
    public String mestBokstav(){
      String mestBoks = "";
      int storst= antallTegn[0];

      for( int i = 0; i<29; i++){
        if(antallTegn[i]>storst){
          storst = antallTegn[i];
        }
      }
      for( int i = 0; i<29; i++){
        if(antallTegn[i]==storst){
          mestBoks+=(char)(i+65)+", ";

        }
      }
      return mestBoks;
    }
  }
