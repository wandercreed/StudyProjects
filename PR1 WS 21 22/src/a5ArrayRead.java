import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class a5ArrayRead {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("src/namensliste.csv"));
		ArrayList<String> man = new ArrayList<>();
		ArrayList<String> frau = new ArrayList<>();
		
		String text = "";
		String[]getrennt;
		String gender;
		String name;
		
		while (scan.hasNextLine()) {
			
			text = scan.nextLine();
			getrennt = text.split(";");//macht ein Array[] nach ";" split
			gender = getrennt[1];//greift Daten an der Stelle getrennt[1]
			name = getrennt[0];//greift Daten an der Stelle getrennt[0]
			
			//System.out.println(gender); test gender ausgabe
			
			if (gender.contentEquals("w")) {
				frau.add(name);
			} else { 
				gender.contentEquals("f");
				man.add(name);
				
			}
			}
		scan.close();
		System.out.println ("Frauen ");
		System.out.println("Frau Array list Ausgabe: " + frau);
		
		for (String s : frau) {
			System.out.println("+ " + s);
			
		}
		System.out.println("Maenner: ");
		System.out.println("Maenner Array list Ausgabe: " + man);
		
		for (String s : man) {
			System.out.println("- " + s);
		}
		

	}

}
