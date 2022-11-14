package exceptionsStuff;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new URL("https://www.hs-mannheim.de/").openStream());

		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		} catch (MalformedURLException mue) {


			mue.printStackTrace();
		} catch (IOException ioe) {
			//e.printStackTrace();
			System.err.println(ioe.getLocalizedMessage());
		}

	}

}
