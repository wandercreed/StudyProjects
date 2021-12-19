
public class a3g {

	public static void main(String[] args) {

		double rechnung;
		double ergebnis = 0;
		double zehn;
		double pi = Math.PI;
		
		System.out.printf("PI Laut Math.PI: %.6f\n",pi);
       
        for (int a = 1;a<=7;a++) {
        	zehn = (int) Math.pow(10, a);
        	
        	for (int k = 0;k<=zehn;k++) {
        		rechnung = Math.pow((-1), k) / (2*k+1);
        		ergebnis = ergebnis + rechnung;
        	}
        	ergebnis *=4;
        	System.out.println("K von 0 bis " + zehn + " :PI ist"+ ergebnis);
        	//System.out.print("K von 0 bis" + zehn + " %d. ergebnis %.6f \n ");
        	//System.out.printf("ergebnis %.6f \n ",ergebnis);
        	ergebnis = 0;
        }

	}

}
