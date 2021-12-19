import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a6c {

	public static void main(String[] args) throws IOException {

		String filename = "src/lorem ipsum.txt";     
		
		for (String s : getLinesFromFile(filename)) {			
			System.out.println(s);
			
		}

	}

	public static ArrayList<String> getLinesFromFile(String filename) throws IOException {

		ArrayList<String> textresult = new ArrayList<>();
		
		Scanner scanner = new Scanner(new File(filename));

		while (scanner.hasNextLine()) {
			String[] text = scanner.nextLine().split(";");

			for (int i = 0; i < text.length; i++) {
				textresult.add(text[i]);
			}
		}
		
		return textresult;

	}

}
