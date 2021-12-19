
public class a8aREKURSION {

	public static void main(String[] args) {

		int rfa = rfak(3);
		int ifa = ifak(7);
		System.out.println("Factorial berechnet mit Rekursion ->> " + rfa);

		System.out.println("Factorual berechnet Iterativ ->> " + ifa);

	}

	public static int rfak(int a) {

		if (a == 1) {
			return 1;
		} else if (a == 0) {
		return 0;}else {
		}
			return a * rfak(a - 1);
		}

	

	public static int ifak(int a) {

		int result = 1;

		if (a == 1) {
			return result;
		} else {
			for (int i = 1; i <= a; i++) {
				result *= i;
			}

			return result;
		  }

	}

}
