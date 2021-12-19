import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a5a {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("src/namensliste.csv"));

		//ArrayList<String> geschlaecht = new ArrayList<>();

		while (scanner.hasNext()) {

			String text = scanner.nextLine();

			String clear = text.replaceAll(";w", " (weiblich)");
			String clear2 = clear.replaceAll(";m", " (mänlich)");
			
			System.out.println(clear2);

		}

	}

}
