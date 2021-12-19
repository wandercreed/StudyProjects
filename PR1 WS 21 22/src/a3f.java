import java.util.Scanner;

public class a3f {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int zahl = (int) ((Math.random() * 10) + 1);
		int eingabe = 0;

		do {
			System.out.println("Versuchen sie die Zahl zu erraten zwischen 1 und 10");
			eingabe = input.nextInt();

			if (eingabe > zahl) {
				System.out.println("Zahl ist zu hoch");

			} else if (eingabe < zahl) {
				System.out.println("Zahl ist zu niedrig");
			}

		} while (zahl != eingabe);
		System.out.println("*** Glueckwunsch! ***");
		System.out.println("Sie haben die Zahl  " + zahl + "  erraten!");
	}

}
