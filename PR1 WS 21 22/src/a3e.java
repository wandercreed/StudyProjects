import java.util.Scanner;

public class a3e {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Zahl nummer 1:");
		int zahl1 = input.nextInt();
		System.out.println("Zahl nummer 2:");
		int zahl2 = input.nextInt();
		int summe = 0;
        
		
		
		if (zahl1>=zahl2) {
			do {
				summe = summe + zahl1;

				zahl1--;

			} while ((zahl1 >= zahl2));	
			System.out.println("Summe :" + summe);
		} else if (zahl1<=zahl2) {
			do {
				summe = summe + zahl1;

				zahl1++;

			} while ((zahl1 <= zahl2));	
			System.out.println("Summe :" + summe);
		}
		
		input.close();
	}

}
