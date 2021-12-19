
public class Kontostand {
	public int kontonummer;
	public int kontostand;
	static int anzahlKunden;

	Kontostand(int kontostand) {

		this.kontonummer = 1000 + anzahlKunden++;
		this.kontostand = kontostand;

	}

	public String toString() {

		String output = "Konto " + this.kontonummer;
		output += ": mit Kontostand  " + this.kontostand + " Euro";

		return output;

	}

	public int getNumber() {

		return this.kontonummer;

	}

	public int getKontostand() {

		return this.kontostand;

	}

	public void setKontostand(int kontostand) {

		this.kontostand = kontostand;

	}

}
