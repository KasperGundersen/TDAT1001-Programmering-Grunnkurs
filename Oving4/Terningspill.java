/*
Øving 4
Program som lager to spillere som kaster terning, førstemann til å få sum høyere enn 100
Dersom man kaster en 1 på terningen starter spilleren å telle på nytt


Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
Øving 4: Oppg. 5.9.2 og 5.9.3

*/

import static javax.swing.JOptionPane.*;
class Spiller{
    int sum = 0;
    int rundenr = 0;

    java.util.Random terning = new java.util.Random();

    public void kastTerning(){
        int terningKast = terning.nextInt(6)+1;
        rundenr++;
        if(terningKast==1){
            sum=0;
        }
        else{
            sum+=terningKast;
        }
    }

    public boolean ikkeFerdig(){
        return sum<100;
    }

    public int getRundenr(){
        return rundenr;
    }
    
    public int getSumPoeng(){
        return sum;
    }
}

class Terningspill{
    public static void main(String[] args){

        Spiller spiller1 = new Spiller();
		Spiller spiller2 = new Spiller();
		
        while(spiller1.ikkeFerdig() && spiller2.ikkeFerdig()){
            spiller1.kastTerning();
            spiller2.kastTerning();
		}
		
        if(!spiller1.ikkeFerdig()){
            showMessageDialog(null, "Spiller A vant etter runde nummer " + spiller1.getRundenr());
        } else {
            showMessageDialog(null, "Spiller B vant etter runde nummer " + spiller2.getRundenr());
        }
    }
}
