import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class datei {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/testdaten.txt"));
		int i = 1;
		
		//int x = Integer.parseInt("4546432");
		
		String content = "";
		while (sc.hasNext()) { // while comes text from .txt
			content = content + (i++ + ":" + sc.nextLine() + "\n");
			// System.out.println(i++ + ": " + sc.nextLine());
		}
		System.out.println(content);
		sc.close();

	}

}
