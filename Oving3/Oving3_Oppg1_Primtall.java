/* Øving 3 - Oppgave 1
 Programm som sjekker om et gitt tall er et primtall eller ikke

  oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
  Øving 3: Oppg. 4.14.1 og 4.14.5
*/
import static javax.swing.JOptionPane.*;
class Oving3_Oppg1_Primtall{
  public static void main(String[] args){

    String tallLest=showInputDialog("Skriv inn tall, avslutt med Esc");
    while(tallLest != null){ // lager em løkke som går så lenge det tastes inn et tall
      int tall=Integer.parseInt(tallLest);
      int deleTall = tall - 1;
       // sjekker om tall er primtall ved å dividere på alle tallene lavere enn tallet

      if(tall==1){ // definerer at tallet 1 ikke er et primtall, fordi 1 er et unntak
        showMessageDialog( null,  tall + " er ikke et primtall.");
      }
      while(deleTall > 1){  // dividerer på alle tallene lavere enn tallet, og høyrere enn 1
        int rest = tall % deleTall;
        if(rest==0){       // er det delelig på et tall mellom 1 og tallet, er det dermed ikke et primtall
          showMessageDialog( null,  tall + " er ikke et primtall.");
          break;
        }
        else{
          deleTall--;
        }
      }
      if(deleTall==1){  // kan ikke tallet deles på noen andre tall enn 1, er det et primtall
        showMessageDialog( null,  tall + " er et primtall.");
      }
      tallLest=showInputDialog("Skriv inn tall, avslutt med Esc"); // gir oss muligheten til kjøre helt til Esc tastes
      }
    }
  }
