import java.io.IOException;

public class a7aCharCounter {
	/*
	 * Schreiben Sie eine Methode, die zählt, wie oft ein bestimmtes Zeichen in
	 * einem String vorkommt. Groß/Kleinschreibung soll dabei ignoriert werden.
	 */
	public static void main(String[] args) throws IOException {
		
		
		String filename = "src/lorem ipsum.txt";  
		
		String str  = a6c.getLinesFromFile(filename).toString(); // weil a6c liefer ArrayList zurueck
		
		char chr = 'l';
		
		System.out.println("Folgende Text" + a6c.getLinesFromFile(filename));
		System.out.println("beinhaltet "+ countCharacter(str,chr) + " von >> " + chr + " << Element");
	}
	
	
	
	public static int countCharacter (String str, char chr) {
		
		str = str.toLowerCase();
		int counter = 0;
		char [] chartext = str.toCharArray();

		for (int i = 0;i < chartext.length;i++) {
			
			if (chartext[i] == chr) {
				counter++;
				
			}
		}
		
		
		return counter;
		
	}

}
