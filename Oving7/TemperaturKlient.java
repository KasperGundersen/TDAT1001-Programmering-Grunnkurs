/*
Øving 7
Et eller annet program med temperaturer

Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 7: Oppg. 9.11.2 og 10.9.1
*/
import javax.swing.JOptionPane;
import java.util.Arrays;
import javax.swing.ImageIcon;
class TemperaturKlient{

  public static void main(String[] args){

  double [][] tempTabell = {{1,-20,1},{-2,7,-6},{3,10,-9},{4,7,8},{10,22,4}};
  Temperaturer temp = new Temperaturer(tempTabell);

  JOptionPane.showMessageDialog(null, "Middeltemperaturen per dag: " + Arrays.toString(temp.midDag()) +
  "\n" + "Middeltemperaturen per time i måneden: " + Arrays.toString(temp.midTimeMoned())+
  "\n" + "Middeltemperaturen for måneden er: " + temp.midMåned() +
  "\n" + "Antall dager med temperaturer under -5 grader: " + temp.dagerMedIntervall(0) +
  "\n" +"Antall dager med temperaturer mellom 0 og 5 grader: " + temp.dagerMedIntervall(2) +
  "\n" +"Antall dager med temperaturer mellom 5 og 10 grader: " + temp.dagerMedIntervall(3) +
  "\n" +"Antall dager med temperaturer over 10 grader: " + temp.dagerMedIntervall(4), "Temperaturer", JOptionPane.INFORMATION_MESSAGE, bilde);
  }
}
