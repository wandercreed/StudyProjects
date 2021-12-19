import java.util.Scanner;

public class vorlesungschleifen2110 {

	public static void main(String[] args) {
		//int x = 1234;	
		//String xAlsString = String.valueOf(x); // integer to String converter
		//i = i + 50;
		//i += 50; // funktioniert AUCH mit + - * /
		
		
		//int i = 100;
		//i++; // i + 1, zahlt aber NACH dem i Wert, ++i wird dan VOR i wert gezaelt	
		//System.out.println(++i + i);// result 202, weil i wird um 1 erhoet und mit sich selbst summiert TESTAT FRAGE
		
		
		
	
	  for (double i =1; i<=1.2; i += 0.02) { 
	  
			System.out.printf("Ausgabe %.3f" , i);
			System.out.println();
		}
		
	/*---------------------------------------------
	 * 	for (int i = 200;i >= 100; i -= 10) { //1.inititialisierung 2. limite 3.inkrement (kann i++ i+= i-= i*= i/=)
			System.out.println("Ausgabe "  + i);			
		}*/
		
		
	/*-------------------------------------------
		 * int i = 1;
		while (i <= 5) {
			System.out.println("Ausgabe " + i);
			i++;
		}*/
		
	/*----------------------------------------
	 * 	for (int i = 1; i <= 10; i++) {
			if (i ==4) {
				continue;bricht if anweisung mit continue
				break; bricht ganze schleife ab
			}
			System.out.println("Durchlauf " + i);*/
		
	/*----------------------------------------
	 * 	Scanner input = new Scanner(System.in);
	
		String password = "sesam";
		String eingabe;
		
		do {
			System.out.println("Bitte password eingeben:");
			 eingabe = input.nextLine();		
			
		}while(!eingabe.equals(password));
		System.out.println("Password ist richtig, sie sind eingeloggt.");
		input.close(); */
		
		
		
		
		/*-------------------------------------
		 * for (int i = 1;i<= 3; i++) {
			for (int j =1;j<=4;j++ ) {
				System.out.println("aussen" + i + ", innen " + j);				
			}
				}*/
     /*    int summe = 0;
	    for (int i = 1; i<=100;i++) {
	    	double wurf = (int) (Math.random() * 20) + 1;// mit Hile von (int) wird den rest abgeschnitten.
			System.out.println("Der" + i + "Wurf ist " +wurf);
			summe += wurf;
	    }
	    System.out.println("Summe " + summe);*/
		
		
		
		/*int wurf;
		int i = 0;
		do {
			 wurf = (int)(Math.random() * 20)+ 1;
			 if (wurf == 13) {// ich will keine 13 sehen
				 continue;
			 }
			System.out.println("der " + ++i + ". Wyrf ist eine " + wurf);
		}while(wurf != 20);
		System.out.println("Glueckwunsch zur 20");*/
		
		}	
	}


