import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class a5d {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> test = new ArrayList<>();

		Scanner scanner = new Scanner(new File("src/laborwerte.csv"));

		while (scanner.hasNextLine()) {

			String[] werte = scanner.nextLine().split(";");

			int zaehler = 0;
			double summe = 0;

			for (int i = 1; i < werte.length; i++) {
				
				zaehler++;
				summe += Double.valueOf(werte[i]);// transformiert Werte in Double und summiert alles
            System.out.println("Test Werte " + werte[i]);
			}
			System.out.printf("%s: %d Werte, Durchschnitt %.1f \n", werte[0], zaehler, summe / zaehler);
			
			/* Ausgabe Modificators
			 *  %s für String,
			 *  %f für Gleitkommazahlen, 
			 *  %d für Integer und %n für
			 * Zeilenumbruch statt \n (Hat was mit Cross-Platform zun tun...)
			 */

		}
		scanner.close();

	}
}