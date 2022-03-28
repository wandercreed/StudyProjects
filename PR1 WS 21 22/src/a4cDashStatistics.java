

public class a4c {

	public static void main(String[] args) {
		int results[] = new int[6];
	

		for (int rolls = 0; rolls < 1000000; rolls++) {
          
			 int randomroll = (int) ((Math.random() * 6)+1);
			 results[randomroll-1]++;


		}
		for (int j = 0; j < results.length; j++) {
			System.out.println("Die " + (j+1) + " wurde: " + results[j] + "-mal gewuerfelt");
		}
		
	}

}
