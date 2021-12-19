

public class array10x10 {

	public static void main(String[] args){
    int [][] einmaleins = new int [10][10];
    
    
    for (int x = 1; x <= 10; x++) {
    	for (int y = 1; y <= 10; y++) {
    		
    		einmaleins[x-1][y-1] = x * y;
    		
    	}    	
    }
    
    for (int i = 0; i < einmaleins.length;i++) {
    	
    	for (int j = 0; j < einmaleins[i].length;j++) {
    		
    		System.out.print(einmaleins[i][j] + "\t");
    		
    	}
    	System.out.println();

   // System.out.println(Arrays.deepToString(einmaleins));
	}
}}
