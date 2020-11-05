/**
 * Øving 9
 * Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
  Øving 9: Oppg. 11.10.1

 *  Klassen konstruerer et objekt med parameterene fornavn, etternavn og fødselsår
 *  Klassen skal ha get-metoder for hvert attributt.
 */
class Person{
  private final String fornavn;
  private final String etternavn;
  private final int fodselsor;

  public Person(String fornavn, String etternavn, int fodselsor){
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.fodselsor = fodselsor;
  }

  public String getFornavn(){
    return fornavn;
  }

  public String getEtternavn(){
    return etternavn;
  }
  public int getFodselsor(){
    return fodselsor;
  }
  public String toString(){
    return fornavn + " " + etternavn + " er født i " + fodselsor;
  }
}
