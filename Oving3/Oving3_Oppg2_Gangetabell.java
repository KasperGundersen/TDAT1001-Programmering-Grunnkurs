/* Øving 3 - Oppgave 2
  Dette programmet skriver ut den lille-gangetabellen(dvs fra 1 til 10) til tall i et gitt intervall.

  oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
  Øving 3: Oppg. 4.14.1 og 4.14.5
*/
import static javax.swing.JOptionPane.*;
class Oving3_Oppg2_Gangetabell{
  public static void main(String[] args){
    String startTallLest = showInputDialog("Gangetabell start:");
    String sluttTallLest = showInputDialog("Gangetabell slutt:");
    int startTall = Integer.parseInt(startTallLest);
    int sluttTall = Integer.parseInt(sluttTallLest);

    for(int b= startTall; b<=sluttTall; b++){

    System.out.println(b + "-gangen:");
    for( int a=1; a<=10; a++){
      System.out.println(b + "*" + a + "=" + b*a);
    }
  }
}
}
