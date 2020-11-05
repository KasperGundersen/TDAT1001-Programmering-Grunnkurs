/**
 * Øving 10
 * Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
 * Øving 10: Oppg. 12.10.1
 * 
 * Klasse som lager en student
 */
import static javax.swing.JOptionPane.*;
class Student{
  private String navn;
  private int antOppg;

  public Student( String navn, int antOppg){
    if (navn == null || navn.trim().equals("")){
      throw new IllegalArgumentException("Navn og antall oppgaver må oppgis!");
    }
    this.navn = navn.trim();
    this.antOppg = antOppg;
  }

  public String getNavn(){
    return navn;
  }

  public int getAntOppg(){
    return antOppg;
  }

  public void justerAntOppg(int justering){
    if ( justering < 0){
      throw new IllegalArgumentException("Antall oppgaver kan ikke være negativ!!");
    }
    antOppg += justering;
  }

  public String toString(){
    return "Navn: " + navn + ", Antall oppgaver: " + antOppg + ".";
  }
}
