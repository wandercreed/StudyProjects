import java.util.HashMap;

public class Kontoverwaltung {

	public static HashMap<Integer, NewKonto> kontos = new HashMap<>();

	public static void main(String[] args) {
		String input = "";
		String command = "";
		int kn = 0;
		int beitrag = 0;
		boolean ENDE = false;
		boolean ZEIGENalles = false;

		do {
			input = a7b.readStringFromKeyboard("Insert command", '>');
			String[] elems = input.split(" ");
			command = elems[0];

			try {
				switch (input) {
				case "zeigen alles":
					zeigeAlleKonten();
					ZEIGENalles = true;
					break;
				}
				
				switch (command) {
				
				case "anlegen":
					kn = Integer.parseInt(elems[1]);
					anlegen(kn);
					System.out.println("Konto >" + kn + "< wurde angelegt");
					break;

				case "einzahlen":
					kn = Integer.parseInt(elems[1]);
					beitrag = Integer.parseInt(elems[2]);
					einzahlen(kn, beitrag);
					System.out.println("auf dem Konto >" + kn + "< wurde >"+ beitrag + "< eingezahlt");
					break;

				case "zeigen":
					if (ZEIGENalles != true) {
						kn = Integer.parseInt(elems[1]);
						zeigenKonto(kn);
					}
					break;

				case "abheben":
					kn = Integer.parseInt(elems[1]);
					beitrag = Integer.parseInt(elems[2]);
					abheben(kn, beitrag);
					System.out.println("von dem Konto >" + kn + "< wurde >"+ beitrag + "< abgehoben" );
					break;

				case "ende":
					ENDE = true;
					System.out.println("Programm wird beendet");
					break;
				}

			} catch (Exception e) {
				System.out.println(
						"Falsche Eingabe, folgende Commands sind verfuegbar: anlegen(+kontonummer), zeigen(+kontonummer),zeigen alles(alle Konto anzeigen)\n, abheben(+kontonummer,beitrag) oder ende");
			}

		} while (ENDE != true);

	}

	public static void anlegen(int kontonummer) {
		NewKonto konto = new NewKonto(kontonummer, 0);
		kontos.put(kontonummer, konto);
	}

	public static void einzahlen(int kontonummer, int beitrag) {

		kontos.get(kontonummer).einzahlen(beitrag);

	}

	public static void abheben(int kontonummer, int beitrag) {
		kontos.get(kontonummer).abheben(beitrag);
	}

	public static void zeigenKonto(int kontonummer) {

		kontos.get(kontonummer);
	}

	public static void zeigeAlleKonten() {
		for (Integer key : kontos.keySet())
			System.out.println(kontos.get(key));
	}

}
