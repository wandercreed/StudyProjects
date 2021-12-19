public class a1 {
	public static void main(String[] args) {

		// Aufgabe 1a
		int zahl1 = 99;
		int zahl2 = 17;
		int resultat = zahl1 % zahl2;
		System.out.println("Teilt man " + zahl1 + " durch " + zahl2 + ", so bleibt ein Rest von " + resultat);
		System.out.println();

		// Aufgabe 1b
		int kantenlange = 8;
		int umfang = kantenlange * 4;
		int flaeche = kantenlange * kantenlange;
		System.out.println("Ein Quadrat mit Kantenlange " + kantenlange + "cm hat einen Umfang von " + umfang
				+ "cm und eine Flaeche von " + flaeche + "cm^2");
		System.out.println();


		// Aufgabe 1d
		double temperatur = 39.8;
		System.out.println();
		if (temperatur >= 37.4) {
			System.out.println("Achtung, Patient hat Fieber!");

		} else {
			System.out.println("Patient hat keine Fieber!");
		}
		System.out.println();

		// Aufgabe 1f
		int zahl1f = 99;
		int zahl2f = 17;

		// int testresult1f = zahl1f % zahl2f;
		// System.out.println(testresult1f);

		int trueresult1f = zahl1f - (zahl1f / zahl2f) * zahl2f;
		System.out.println("Teilt man " + zahl1f + " durch " + zahl2f + ", so bleibt ein Rest von " + trueresult1f);
		
	}

}
