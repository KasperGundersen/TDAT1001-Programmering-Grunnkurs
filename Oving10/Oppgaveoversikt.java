/**
 * Øving 10
 * Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
 * Øving 10: Oppg. 12.10.1
 * 
 * Klasse som registrerer oppgaver til en student
 */
import static javax.swing.JOptionPane.*;
class Oppgaveoversikt{
  private Student[] studenter =new Student[0];
  private int antStud = 0;

  public Oppgaveoversikt(){
    Student[] studenter = new Student[1];
  }

  private void utvidTabell(){
    Student[] nyTab = new Student[studenter.length + 1];
    for(int i = 0; i<studenter.length; i++){
      nyTab[i] = studenter[i];
    }
    studenter = nyTab;
  }

  public int finnAntStud(){
    antStud = studenter.length;
    return antStud;
  }

  public int finnAntOppg(String navn){
    for(int i = 0; i<studenter.length;i++){
      if(studenter[i].getNavn().equals(navn.trim())){
        return studenter[i].getAntOppg();
      }
    }
    return -1;
  }

  public void setNyStud(Student nyStudent){
    utvidTabell();
    studenter[studenter.length-1] = nyStudent;
    antStud++;
  }

  public void setNyOppg(String navn, int nyOppg){
    for(int i = 0; i<studenter.length;i++){
      if(studenter[i].getNavn().equals(navn.trim())){
        studenter[i].justerAntOppg(nyOppg);
      }
    }
  }

  
  public static void main(String[] args){

    Oppgaveoversikt oversikt = new Oppgaveoversikt();

    Student Kasper = new Student("Kasper", 3);
    Student Emir = new Student("Emir", 2);

    oversikt.setNyStud(Kasper);
    oversikt.setNyStud(Emir);


    System.out.println(Kasper + "\n" + Emir);

    oversikt.setNyOppg("Emir", 6);
    System.out.println(Emir);
    System.out.println("Antall oppgaver: " + oversikt.finnAntOppg("Kasper"));

  }
}



