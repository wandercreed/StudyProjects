import java.util.HashMap;

public class NewKonto {
	
	public static HashMap<Integer, NewKonto> kontoVerwaltung = new HashMap<>();
	public int kontonummer;
	public int kontostand;

	NewKonto(int kontonummer, int kontostand) {

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

	public static void zeigeAlleKonten() {
		if (kontoVerwaltung.isEmpty()) {
			System.out.println("Bisher keine Kontos angelegt");

		} else {
			for (Integer key : kontoVerwaltung.keySet()) {
				System.out.println(kontoVerwaltung.get(key));
			}

		}

	}

	public static void anlegen(int kontonummer) {
		NewKonto konto = new NewKonto(kontonummer, 0);
		kontoVerwaltung.put(kontonummer, konto);
	}

	public static void einzahlen(int kontonummer, int beitrag) {

		kontoVerwaltung.get(kontonummer).einzahlen(beitrag);

	}

	public static void abheben(int kontonummer, int beitrag) {
		kontoVerwaltung.get(kontonummer).abheben(beitrag);
	}

	public static void zeigenKonto(int kontonummer) {

		System.out.println(kontoVerwaltung.get(kontonummer));
	}
}