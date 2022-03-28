

public class a4cDashStatistics {

	public static void main(String[] args) {
		
		/*
		 * Schreiben Sie ein Programm, das eine Million Mal würfelt und eine Statistik
		 * erstellt.
		 */
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
