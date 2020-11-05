## Case-beskrivelse - Kunstutstilling
Du skal lage et objektorientert program med tema Kunstutstilling.
En kunstutstilling viser fram kunstverk av ulike slag (Malerier, skulpturer, og lignende) laget
av forskjellige kunstnere. For å forenkle oppgaven har vi valgt ta bort alt som handler om kjøp
og salg av kunstverk.

Du skal i denne eksamensoppgave jobbe med 4 ulike klasser:
- Navn (Delvis gitt i vedlegg 1)
- Kunstverk
- Utstilling
- Klientprogram

### Kunstverk.
Klassen skal være immutabel. Et kunstverk har et navn og en type der type kan være malerier,
skulpturer, og lignende. For hvert kunstverk skal det også lagres informasjon om antall kopier
og hvilket nr i rekken dette er og navnet til kunsteren (se vedlegg 1).
Akvarellen ”Elg i Solnedgang” finnes feks i 100 eksemplarer og det som stilles ut på
utstillingen er nr 21 skal da vises i listene som:
nr/ antall kopier/ tittel/ Navn på kunstner:
12/ 100 ”Elg i Solnedgang” Gustav Olsen

### Utstilling.
En Utstilling beskrives av et navn og liste over alle registrerte kunstverk.
Alle registrerte data for en utstilling er lagret på fila "utsilling.ser".

### Klientprogram
Et enkelt menystyrt program for å teste klasser og metoder.

### Navn
Hentet fra læreboka i Java for å holde styr på navn som består av fornavn og etternavn.

**MERK**
- Dersom du trenger flere metoder i noen av klassene for å løse en deloppgave må du huske på å også lage
disse - angi i hvilken klasse de ulike metodene da tilhører.
- Husk at det skal være samsvar mellom kodeløsning og klassediagram utarbeidet i
oppgave 1

---

## Oppgave 1
a. Les casebeskrivelse og hele oppgavesettet og lag ett utvidet
klassediagram for alle klassene.
b. Vis i klassediagrammet hvordan du mener de ulike klassene bør
samarbeide med hverandre. Begrunn svaret ditt

---

## Oppgave 2 - Klassen Kunstverk
a. sett opp klassens objektvariabler
b. sett opp klassens konstruktør
c. sett opp klassens tilgangsmetoder
d. Lag en metode som sjekker om et kunstverk er likt et annet. To kunstverk er like dersom nr, navn og kunstner er like.

---
## Oppgave 3 - Klassen Utstilling
a. sett opp klassens objektvariabler
b. sett opp klassens konstruktør.
c. Lag en metode som returnerer alle kunstverk til en gitt Kunstner sortert alfabetisk etter kunstverkets tittel.
d. Lag en metode som returnerer en tekststreng med all informasjon om alle registrerte kunstnere og de kunstverk de har på utstillingen.

Eks på utskrift:
`Bryggustillinga 2018
Kunstobjekter på utstillingen:
1\10 Elg i solnedgang Maleri Kari Oppigaarden
2\10 Elg i solnedgang Maleri Kari Oppigaarden
1\1 Ut mot havet Maleri Kari Oppigaarden
1\1 Vandreren Skulptur Petter Olsen
1\10 Vårstemning Skulptur Petter Olsen
101\250 Glede Maleri Petter Olsen`

--- 
## Oppgave 4 - klassen Utstilling
a. Lag en metode i klassen Utstilling som lagrer all informasjon om de kunstverk som skal utstilles på fila "kunstverk.ser"
b. Hva må du legge til for alle klassene i koden for å få metoden i oppgaven over til fungere?

---
## Oppgave 5 - klassen Klientprogram
1. Lag et enkelt menystyrt program der bruker for mulighet for tre ulike menyvalg: List alle kunstverk, Legg til nytt kuntsverk og Avslutt. Du trenger ikke lage kode for å opprette og fylle Utstillings-objekt med data.
Du kan anta at dette eksisterer.