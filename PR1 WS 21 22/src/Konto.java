import java.util.HashMap;
import java.util.Scanner;

public class Konto {

	public static int kontostand;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Aufgabe 9a teil 1
		Kontostand konto1 = new Kontostand(kontostand);
		konto1.kontostand = 0;
		System.out.println("Ausgabe Aufgabe 9a: " + konto1.toString());

		Kontostand konto2 = new Kontostand(kontostand);
		konto2.kontostand = 500;
		System.out.println("Ausgabe Aufgabe 9a: " + konto2.toString());

		Kontostand konto3 = new Kontostand(kontostand);
		konto3.kontostand = 2000;
		System.out.println("Ausgabe Aufgabe 9a: " + konto3.toString());

		// Aufgabe 9a teil 2
		konto1.setKontostand(-100);
		konto2.setKontostand(1000);
		konto3.setKontostand(1500);
		System.out.println("Ausgabe Aufgabe 9a2: " + konto1.toString());
		System.out.println("Ausgabe Aufgabe 9a2: " + konto2.toString());
		System.out.println("Ausgabe Aufgabe 9a2: " + konto3.toString());

		// Aufgabe 9b
		HashMap<Integer, Kontostand> kontos = new HashMap<>();
		kontos.put(konto1.kontonummer, konto1);
		kontos.put(konto2.getNumber(), konto2);
		kontos.put(konto3.getNumber(), konto3);

		/*
		 * int schluessel = 1000; for (int i = 0; i < kontos.size();i++) {
		 * 
		 * System.out.println("Hash Map ausgabe: " + kontos.get(schluessel));
		 * schluessel++; }
		 */
		System.out.println("Hash Map ausgabe: " + kontos.get(konto1.kontonummer));
		System.out.println("Hash Map ausgabe: " + kontos.get(konto2.kontonummer));
		System.out.println("Hash Map ausgabe: " + kontos.get(konto3.kontonummer));
		// System.out.println(kontos.toString());
		System.out.println(kontos.keySet());

	}
}
