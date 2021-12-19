import java.util.Scanner;

public class a2e {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben sie eine von folgende Figuren ein: Quadrat, Rechteck oder Trapez");

		String figure = input.nextLine();
		String nospace = figure.trim();
		String figurenonumbers = nospace.replaceAll("[0-9]", "");
		String figurecleared = figurenonumbers.toLowerCase();

		if (figurecleared.equals("quadrat")) {
			System.out.println("Bitte geven sie Quadrat kantenlange: ");
			double kantenlange = input.nextDouble();
			input.nextLine();
			
			double flaeche = kantenlange * kantenlange;			
			System.out.printf("Quadrat Flaeche ist: %.2f" , flaeche);

		} else if (figurecleared.equals("rechteck")) {
			
			System.out.println("Rechteck breite:");
			double breite = input.nextDouble();
			
			
			System.out.println("Rechteck länge:");
			double laenge = input.nextDouble();
			
			
			double flaeche = laenge * breite;
			System.out.printf("Rechteck Flaeche ist: %.2f", flaeche);

		} else if (figurecleared.equals("trapez")) {
			System.out.println("Trapez Höhe: ");
			double h = input.nextDouble();
			System.out.println("Trapez obere Seitenlänge: ");
			double osl = input.nextDouble();
			System.out.println("Trapez untere Seitenlänge: ");
			double usl = input.nextDouble();
			double flaeche = ((usl+osl) / 2) * h;
			System.out.printf("Rechteck Flaeche ist: %.2f", flaeche);

		} else {
			System.out.println("Die Eingabe ist falsch, bitte versuchen sie eine von vorher angebotenen Figuren wählen.");

		}

	}

}
