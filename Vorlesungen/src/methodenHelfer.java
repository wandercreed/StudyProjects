import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class methodenHelfer {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(getFileContent("src/zahlen.txt"));
	}
    // get Line from File to ArrayList
	public static ArrayList<String> getLinesFromFile(String filename) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(filename));
		ArrayList<String> lines = new ArrayList<>();
		while (scan.hasNext()) {
			lines.add(scan.nextLine());
		}
		scan.close();
		return lines;
	}
    
	//Array to String
	public static String convertArrayListToString(ArrayList<String> list) {
		String result = "";
		for (String s : list) {
			result += s + "\n";
			// System.out.println(s);
		}
		return result;
	}
    
	//Ausgabe in String von einem ArrayList from File
	public static String getFileContent(String filename) throws FileNotFoundException {
		return convertArrayListToString(getLinesFromFile(filename));
	}
     
	//randomizer between 2 numbers
	public static int createRandomIntFromTo(int from, int to) {

		int result = (int) (Math.random() * (to - from + 1) + from);
		;

		return result;
	}
	
   //String reversieren
	public static String reverseString(String str) {
		String result = "";
		for (String s : str.split("")) {// dreht String umdreht
			result = s + result;
		}
		return result;
	}
	
}
