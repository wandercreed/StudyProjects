import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class trycatchtry {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("src/testdaten.txt"));
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Datei nicht gefunden!");
		}
	}
}