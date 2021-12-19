import java.util.Scanner;

public class a6bRANDbetweenXY {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

    	
		System.out.println("Bitter geben lower zahl");
		int low = scan.nextInt();
		System.out.println("Bitter geben upper zahl");
		int top = scan.nextInt();

		int result = createRandomInt(low, top);

		System.out.println("Result randomized->>>> " + result);
		
		
        }
		
		

	public static int createRandomInt(int lower, int upper) {
		
        int randomizer = (int) (Math.random() * (upper - lower + 1) + lower);
        
		return randomizer;

	}

}
