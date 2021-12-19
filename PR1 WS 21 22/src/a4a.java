
import java.util.Scanner;
public class a4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte text ueber Testatur eingeben: ");
        String text = input.nextLine();
        
        //String [] einzelBuchstaben = text.split("");
        char[] einzelBuchstaben = text.toCharArray();
        
        
        for (int i = 0; i < einzelBuchstaben.length; i++) {
        	if (i == 'e') {
        		continue;
        	}
        	System.out.print("Position " + i +  " ");
        	System.out.println(einzelBuchstaben[i]);
        }
	}

}
