import java.util.Scanner;

public class a2a {

	public static void main(String[] args) {
	
		
		
		//Aufgabe 2a
		Scanner input = new Scanner(System.in);
		System.out.println("Wie ist Ihre Name?");
		String name = input.nextLine();
		System.out.println("Hallo " + name);

				
		//Aufgabe 2b
		System.out.println("Bitte geben sie die 1. Zahl: ");
		int zahl1 = input.nextInt();		
		System.out.println("Bitte geben sie die 2. Zahl: ");
		int zahl2 = input.nextInt();	
		int resultat = zahl1 % zahl2;
		
		System.out.println("Teilt man " + zahl1 + " durch " + zahl2 + ", so bleibt ein Rest von " + resultat);
		System.out.println();
		
		
		
		input.close();
		
		
		
	}

}
