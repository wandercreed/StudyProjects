
public class a3d {

	public static void main(String[] args) {
		int wurf = 0;
		int previouswurf = 0;
		int zaehler = 0;
		boolean wurfequal = false;

		do {
			previouswurf = wurf;
			wurf = (int) (Math.random() * 20) + 1;
			System.out.println("der " + ++zaehler + ". Wyrf ist eine " + wurf);

			if (wurf == previouswurf) {
				wurfequal = true;
			}

		} while (wurfequal != true);
		System.out.println("am "+zaehler + ". Wurf kam es zweimal hintereinanger ein " + wurf);

	}

}
