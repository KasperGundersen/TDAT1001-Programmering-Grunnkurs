![](RackMultipart20201105-4-1xb30kh_html_b0cddcb91fac865.jpg)

Fakultet for teknologi

**Eksamensoppgave i
 TDAT1001 Programmering Grunnkurs**

**Faglig kontakt under eksamen:**

Bjørn Klefstad, tlf 73 55 95 72

Grethe Sandstrak 970 21 238

**Eksamensdato:** 08.12.2016

**Eksamenstid (fra-til):** 0900-1300

**Hjelpemiddelkode/Tillatte hjelpemidler:** Alle trykte (tillatt med egne notater i lærebok)

**Annen informasjon:**

Les gjennom hele oppgavesettet før du begynner arbeidet, og disponer tiden.

Dersom noe virker uklart i oppgavesettet, skal du gjøre dine egne antagelser og forklare dette i besvarelsen.

Lykke til!

## Målform/språk: Bokmål

## Antall sider (uten forside): 2

**Antall sider vedlegg:** 1

### **Case beskrivelse**

Vi har et bilutleiefirma som leier ut biler. Det skal i denne oppgaven lages en applikasjon i Java for å holde oversikt over de ulike kjøretøyene og hvilke hjul og motor de er utstyrt med. Figuren under viser klassediagram som beskriver hvilke klasser løsningen består av og forholdet mellom disse. Merk: klassene er kun delvis modellert i figuren under:

###


### ![](RackMultipart20201105-4-1xb30kh_html_2b0b55053c4d6d35.png)

###
**Oppgave 1 (100%)**

1. Les hele oppgaveteksten og sett opp et utvidet klassediagram for alle klassene i løsningen.
2. Lag den immutable klassen Hjul med konstruktør, tilgangsmetoder og toString-metode.
 Ett hjul har et merke, dimensjon og dekktype.
 Eks: Merke: Continental, Dimensjon: 235/65R17, Dekktype: Vinterdekk
3. Lag den immutable klassen Motor med konstruktør, tilgangsmetoder og toString-metode.
 En motor har et motornr, girkasse og motortype.
 Eks: Motornr: 12345678912, Girkasse: Automat, Motortype: Diesel
4. Lag klassen Bil i henhold til klassediagrammet som vist i figur over og beskrivelse gitt i oppgaven. Klassen skal ha én konstruktør, tilgangsmetoder og en toString-metode.

Forutsetning: En Bil har 4 hjul der alle hjul må være like (samme merke/dimensjon/type).

1. Beskriv med tekst hvordan du ville løst oppgave d) dersom forutsetningen var at «En Bil har 4 hjul der 2 og 2 hjul må være like»?
2. Lag metode(r) som sammenligner to objekter av typen Bil og finner ut om de er like eller ikke. To biler er like dersom de har samme registreringsnummer og motornummer. (
 Husk å angi i hvilke(n) klasse metoden(e) hører til.
3. Lag klassen UtleieFirma. Et utleiefirma har et navn og flere utleiebiler. Sett opp klassens objektvariabler og lag en konstruktør som tar inn navn på firmaet og maks antall utleiebiler det er plass til. Maks antall biler kan ikke endres senere.
4. Lag en metode i klassen UtleieFirma for å registrere en ny bil. Ny bil kan kun registreres dersom det er plass til den og dersom den ikke er registrert fra før.
5. Lag en metode i klassen UtleieFirma som returnerer alle biler sortert på registreringsnummer.
6. I vedlegg 1 finner du rammeverket til et klient program. Fyll inn det som mangler under valget: «Registrer ny Bil.»
7. Lag en metode som leser et objekt av typen UtleieFirma fra fil og returner dette. Utform metoden på en slik måte at programkrasj unngås.
 Marker de endringer du må gjøre i den koden du allerede har utviklet.

**VEDLEGG 1**

_int valg = showOptionDialog(null, &quot;Velg operasjon&quot;, &quot;Eksamen høst 2016&quot;, YES\_NO\_OPTION, INFORMATION\_MESSAGE, null, muligheter, muligheter[0]);_

_String filnavn = showInputDialog(&quot;filnavn: &quot;);_

_Utleiefirma utleieFirma = lesUtleieFirmaFraFil(filnavn);_

_while (valg != AVSLUTT){_

_switch (valg){_

_case NYTT\_FIRMA:_

_// skal ikke fylles ut_

_break;_

**case REG\_BIL:**

**if (utleieFirma != null){**

# **/\* OPPGAVE j) fylles inn her \*/**
**}**

**break;**

_case LIST\_FIRMA:_

_if (utleieFirma != null){// skal ikke fylles ut }_

_break;_

_case LIST\_SORTERT:_

_if (utleieFirma != null){ // skal ikke fylles ut }_

_break;_

_case HENT\_SAMME\_GIRKASSE:_

_if (utleieFirma != null){// skal ikke fylles ut}_

_default: break;_

_}_

_valg = showOptionDialog(null,&quot;Velg operasjon&quot;,&quot;Eksamen høst 2016&quot;, DEFAULT\_OPTION, PLAIN\_MESSAGE, null, muligheter, muligheter[0]);_

_}_

­­­­­­­­­­­­­­­­­