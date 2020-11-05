/**
 * Øving 11
 * Oppgaver hentet fra læreboka: Else Lervik og Vegard B. Havdal: "Programmering i Java", siste utgave
 * Øving 11: Oppg. 16.13.3
 * Programm som tar for seg transaksjoner for en konto.
 * Leser inn transaksjoner fra en fil og setter enten inn penger på saldo eller tar ut penger
 * Leser på formatet:
 * U 450
 * I 567.80
 * 
 * Der U er penger ut, og I er penger inn på saldo
 * 
 * Saldoen ligger i egen fil
 */

import java.io.*;
import static javax.swing.JOptionPane.*;

class Transaksjoner{
  public static void main(String[] args) throws IOException, FileNotFoundException{

    String saldoTeks = "saldo.txt";
    String transaksjonerTekst = "transaksjonerListe.txt";


    String[] tabell;
    double belop = 0.0;
    double saldoVerdi = 0;

    try (FileReader leseForbindelseSaldo = new FileReader(saldoTeks);) {
		BufferedReader leseSaldo = new BufferedReader(leseForbindelseSaldo);
		String saldoLest = leseSaldo.readLine();
		saldoVerdi = Double.parseDouble(saldoLest);
		leseSaldo.close();
  	} catch (FileNotFoundException e){
    	System.out.println("Fant ikke filen");
  	} catch (IOException e){
		System.out.println("IOException");
	}

    try (FileReader leseForbindelseTransaksjoner = new FileReader(transaksjonerTekst);) {
		BufferedReader leseTransaksjon = new BufferedReader(leseForbindelseTransaksjoner);
		String transaksjoner = leseTransaksjon.readLine();


		while(transaksjoner !=null){
			tabell = transaksjoner.split(" ");
			double endringTall = Double.parseDouble(tabell[1]);
			if(tabell[0].equals("U")){
				saldoVerdi -= endringTall;
			} else if(tabell[0].equals("I")){
				saldoVerdi += endringTall;
			}
			transaksjoner = leseTransaksjon.readLine();
		}
		System.out.println(saldoVerdi);
		leseTransaksjon.close();
	} catch (FileNotFoundException e){
		System.out.println("Fant ikke filen");
	} catch (IOException e){
		System.out.println("IOException");
	}

    try (FileWriter skriveforbTilSaldo = new FileWriter(saldoTeks, false);) {
		PrintWriter skriver = new PrintWriter(new BufferedWriter(skriveforbTilSaldo));
		if (saldoVerdi > 0) {
			skriver.println(saldoVerdi);
		}
		skriver.close();
    } catch (FileNotFoundException e){
		System.out.println("Fant ikke filen");
    } catch (IOException e){
		System.out.println("IOException");
    }
  }
}
