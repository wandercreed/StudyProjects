import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class a5cc {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("src/namensliste.csv"));
	
		ArrayList<String> man = new ArrayList<>();
		ArrayList<String> frau = new ArrayList<>();
		
		
		
     String z = "";
     String[] getrennt;
     String g;
     String name = "";
     
		while (scanner.hasNextLine()) {
			z = scanner.nextLine();
			getrennt = z.split(";");
			g = getrennt[1];
			name = getrennt[0];
			
			//String text = scanner.next();
	if(g.contentEquals("w")) {
		frau.add(name);
	}else {
		man.add(name);
	}
			
		}
		scanner.close();
		
		System.out.println("Frauen: ");
		for (String s :frau) {
			System.out.println(" + " + s);
		}
		System.out.println("Maenner: ");
		for (String s: man) { 
			System.out.println(" - " + s);
		}
	}
}