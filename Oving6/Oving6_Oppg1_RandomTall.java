/*
Øving 6
Program som lager 1000 random tall mellom 1 og 10. Og returnerer hvor mange det er av hvert tall


Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 6 : Oppg. 7.8.1 og 7.8.3

*/
import static java.util.Random.*;

class Oving6_Oppg1_RandomTall{
  
  static java.util.Random random = new java.util.Random();

  public static int tilfeldigTall(){
    int tall = random.nextInt(10);
    return tall;
  }

public static void main(String[] args){

    int teller = 0;
    int[] antall = new int[10];

    while (teller < 1000) {

      int x = tilfeldigTall();

      antall[x]++;
      teller++;
    }

    for (int i = 0; i < antall.length; i++) {
      System.out.println("Antall " + i + ": " + antall[i]);
    }
  }
}
