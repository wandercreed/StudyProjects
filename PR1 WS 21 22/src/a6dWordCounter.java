import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class a6dWordCounter {

	public static void main(String[] args) throws IOException {

		String filename = "src/lorem ipsum.txt";


		System.out.println("Text beinhaltet ->> " + countWordsInFile(a6c.getLinesFromFile(filename)) + " <<- Wörter");

		System.out.println();



		for (String s : a6c.getLinesFromFile(filename)) {
			System.out.println(s);
		}

	}


	public static int countWordsInFile(ArrayList<String> filename) {

		int words = 0;

		for (String s : filename) {

			s = s.trim();

			if (!s.isEmpty()) {
				words += s.split(" ").length;
			}
			
		}
		return words;

	}

}
