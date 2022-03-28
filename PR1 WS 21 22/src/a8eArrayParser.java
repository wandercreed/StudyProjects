//import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Scanner;

public class a8eArrayParser {

	public String kennzeichen; // globale Variablen
	public String model;
	public int kilometerstand;

	a8eArrayParser(String zeichen, String mod, int stand) {// Konstruktor
		this.kennzeichen = zeichen;
		this.model = mod;
		this.kilometerstand = stand;
	}

	public String toString() {
		String output = this.model;
		output += " mit Kennzeichen: " + this.kennzeichen;
		output += " und Kilometerstand " + this.kilometerstand;
		return output;
	}

	public static void main(String[] args) throws IOException {

		ArrayList<a8eArrayParser> autosobject = new ArrayList<>();
		
		ArrayList<String> autosstring = a6c.getLinesFromFile("src/autos.csv");

		for (int i = 0; i < autosstring.size(); i += 3) {//Array durchlaufen
			
			String zeichen = autosstring.get(i);
			String mod = autosstring.get(i + 1);
			int km = Integer.parseInt(autosstring.get(i + 2));// string to integer fur i+2 position
			
			a8eArrayParser auto = new a8eArrayParser(zeichen, mod, km);//konstruktor aufruf
			autosobject.add(auto);

		}
		
		for(a8eArrayParser auto : autosobject) {
			System.out.println(auto);
			}

		 System.out.println(autosobject);
	}
}