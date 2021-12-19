
public class NewKonto {
    public int kontonummer;
    public int kontostand;
  //  public static int anzahlKonten;
    
    NewKonto(int kontonummer,int kontostand){
    
    	this.kontonummer = kontonummer;
    	this.kontostand = kontostand;
    }
    
    public void einzahlen(int summe) {
    	this.kontostand = summe;
    }
    
    public void abheben(int summe) {
    	this.kontostand = kontostand - summe;
    }
    
    
    public String toString() {

		String output = "Konto " + this.kontonummer;
		output += ": mit Kontostand  " + this.kontostand + " Euro";
		return output;

	}
    
}
