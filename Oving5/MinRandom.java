/*
Øving 5
Program som lar deg lage to random tall, enten heltall eller desimaltall i et gitt intervall

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 5: Oppg. 6.10.2 og 6.10.3

*/
import java.util.*;
import static javax.swing.JOptionPane.*;
class MinRandom{

  public static int nesteHeltall(int nedre, int ovre){
    Random ran = new Random();
    int nxt = ran.nextInt(ovre-nedre) + nedre;
    return nxt;
  }

  public static double nesteDesimaltall(double nedre, double ovre){
    Random ran = new Random();
    double nxt = ran.nextDouble()*(ovre-nedre) + nedre;
    return nxt;
  }
  public static void main(String[] args) {

    int startTall = 5;
    int sluttTall = 10;

    showMessageDialog(null, "Neste tilfeldige heltall mellom " + startTall + " og " + sluttTall + " er:   " +
     nesteHeltall(startTall, sluttTall) + "\n Neste tilfeldige desimaltall mellom " + startTall + " og " +
     sluttTall + " er:   " + String.format("%.2f", nesteDesimaltall(startTall, sluttTall)));
  }
}
