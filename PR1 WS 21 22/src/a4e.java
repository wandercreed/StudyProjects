import java.util.Arrays;

public class a4e {

	public static void main(String[] args) {
		String text = "scrumbed";
		
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
