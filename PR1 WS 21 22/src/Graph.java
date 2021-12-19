import java.util.ArrayList;

public class Graph {

	public int x;
	public int y;
	public static int counter;
	public static ArrayList<Punkt> punkten = new ArrayList<>();

	public static void main(String[] args) {
		int counterhere = counter;
		
		for (int i = 1; i < 101; i++) {
			int randomizer = (int) ((Math.random() * 100) + 1);
			//counter++;

			//addPunkt(Punkt.getCounter(),i, randomizer);
			addPunkt(i, randomizer);
		}
		
		System.out.println("Punkten in ArrayList: " + punkten.toString());
        
		for (Punkt obj : punkten) {
		counter++;
			System.out.println(counter + ". Punkt" + obj);
		}

	}

	public static void addPunkt(int x, int y) {
		Punkt temp = new Punkt(x, y);
		punkten.add((Punkt) temp);
		
	}

}
