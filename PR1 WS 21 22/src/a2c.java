import java.util.Scanner;

public class a2c {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String password = "123123123";
		String eingabe;
		
		do {
			System.out.println("Bitte password eingeben:");
			 eingabe = input.nextLine();		
			
		} while(!eingabe.equals(password));
		System.out.println("Password ist richtig, sie sind eingeloggt.");
		
		input.close();

	}

}
