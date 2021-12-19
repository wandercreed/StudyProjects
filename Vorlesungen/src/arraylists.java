import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylists {

	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * ArrayList<String> namen = new ArrayList<>(); namen.add("Huy");
		 * namen.add("Heinz"); namen.add("Wilhem-Huy");
		 * 
		 * //System.out.println(namen);
		 * 
		 * for (String name : namen) { System.out.println(name.length()); }
		 * System.out.println(namen.size());//anzahl von Elemente
		 * System.out.println(namen.get(2));//einzelne Elemente zugreifen
		 * System.out.println(namen.isEmpty());
		 */

		/*
		 * ArrayList<Integer> zahlen = new ArrayList<>();
		 * zahlen.add(Integer.valueOf(4711)); zahlen.add(4712);//autoboxing
		 * System.out.println(zahlen);
		 * 
		 * int zahl1 = Integer.parseInt("4711"); Integer zahl2 =
		 * Integer.valueOf("4712"); System.out.println("Test  " + (zahl1 + zahl2));
		 */
        
		Scanner scanner = new Scanner(new File("src/zahlen.txt"));
		
		ArrayList<Integer> zahlen = new ArrayList<>();
		while(scanner.hasNext()) {
		String zahlAlsString = scanner.nextLine();
		int zahl = Integer.parseInt(zahlAlsString);
		zahlen.add(zahl);
		
		}
		System.out.println(zahlen);
		int summe = 0;
		for(int z : zahlen) {
			summe += z;
		}
		System.out.println("Summer ist:  " + summe);
	}

}
