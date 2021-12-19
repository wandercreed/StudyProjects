import java.io.IOException;

public class a7dRandomWord {

	public static void main(String[] args) throws IOException {


		System.out.println(readRandomWordFromFile("src/lorem ipsum.txt"));

	}
    
	
	
	public static String readRandomWordFromFile(String filename) throws IOException {
		
		
		String[] str  = (a6c.getLinesFromFile(filename).toString()).split(" ");
		int randomizer = (int)((Math.random()* str.length)+1);
		
		String temp = str[randomizer];
		
		return temp;
	}
}
