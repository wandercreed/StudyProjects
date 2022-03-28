
public class a3LinesColumnsMultiplication {

	public static void main(String[] args) {

		// Aufgabe 3a

		for (int x = 10; x >= 1; x--) {
			System.out.println("Ausgabe3a: " + x);
		}

		// Aufgabe 3b

		int z = 10;
		while (z >= 1) {
			System.out.println("Ausgabe3b:" + z);
			z--;
		}

		// Aufgabe 3c

		for (int i = 1; i <= 10; i++) { // lines

			for (int j = 1; j <= 10; j++) { // columns
				System.out.print(" " + (j * i) + "\t");

			}
			System.out.println();

		}
	}
}
