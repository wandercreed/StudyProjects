import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class a7eMathPow {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Wie viele Zahlen moechten sie Eingeben? : ");
		int arrayLength = sc.nextInt();
		double[] zahlen = new double[arrayLength];

		System.out.println("Exponent : ");
		double exponent = sc.nextDouble();
		
		System.out.println("Bitte Zahlen eingeben: ");
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = sc.nextDouble();
		}
        
		System.out.println("Array eingegeben : " + Arrays.toString(zahlen));
		exponentiate(zahlen, exponent);
		System.out.println("Array exponentiert : " + Arrays.toString(zahlen));

	}

	public static void exponentiate(double[] numbers, double exponent) {

	
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Math.pow(numbers[i], exponent);

		}

	}

}
