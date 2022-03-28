import java.util.Scanner;

public class a7b {

	public static void main(String[] args) {
		
		String input = readStringFromKeyboard("Bitte geben sie Ihren Benutzername ein: " , '+');

         System.out.println(input);

	}
	
	
	public static String readStringFromKeyboard(String str, char symbol) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(str);       
		System.out.print(symbol);
		
		String text = sc.nextLine();

		
		return text;
	}
	

}
