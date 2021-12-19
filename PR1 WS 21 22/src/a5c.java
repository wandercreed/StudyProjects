import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a5c {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("src/namensliste.csv"));
		ArrayList<String> liste = new ArrayList<>();
		ArrayList<String> man = new ArrayList<>();
		ArrayList<String> weib = new ArrayList<>();

		while (scanner.hasNext()) {
			String text = scanner.next();

			String[] text2 = text.split(";");

			for (int i = 0; i < text2.length; i++) {
				if (text2[i].equals("w")) {			
					weib.add(text2[--i]);
				
					 
					break;

				} else if (text2[i].equals("m")) {
					man.add(text2[--i]);
					 
					break;
				}
				//System.out.println(man);
				//System.out.println(weib);

			}

		}

		// System.out.println(man);
		// System.out.println(liste);

	}

}
