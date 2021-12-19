import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class a5e {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner scanner = new Scanner(new File("src/laborwerte.csv"));

		while (scanner.hasNext()) {
			
			String [] werte = scanner.nextLine().split(";");
			int zaehler = 0;
			double summe = 0;
			
			try {
			 for (int i = 1;i < werte.length;i++) {
				 zaehler++;
				 summe+=Double.valueOf(werte[i]);				 
			 }
			 
			 System.out.printf("%s: %d Werte, Durchschnitt %.1f \n", werte[0], zaehler, summe/zaehler);
			
			 
			} catch (NumberFormatException e) {
			
				System.out.printf("%s: %d Werte, Durchschnitt kann nicht berechnet werden \n ", werte[0], zaehler);	
			}
		  
			
		}	



	}
}