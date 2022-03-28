import java.util.Arrays;

public class a4e {
	/*
	 * Schreiben Sie ein Programm, das ein Wort "scrambled", d.h. die Buchstaben
	 * zufällig vertauscht. Beispiel: Aus dem Wort "MANNHEIM" wird "IEHNAMNM".
	 * Groß-/Kleinschreibung können Sie ignorieren.
	 */
	public static void main(String[] args) {
		String text = "SCRUMBLED";
		
		char[] chararray = text.toCharArray();
		
		for (int i = 0; i < chararray.length; i++) {

			int randomIndex = (int) (Math.random() * chararray.length);

			char temp = chararray[i];

			chararray[i] = chararray[randomIndex];

			chararray[randomIndex] = temp;
		}
		
		//System.out.println(chararray);
		System.out.println("Ausgabe: " + Arrays.toString(chararray));
	}

}
