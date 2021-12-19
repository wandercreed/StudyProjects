
public class a8bREKURSION {

	public static void main(String[] args) {
        int a = 6;
        int b = 10;       
		int mult = mult(a,b);
		System.out.println(mult);
	}
	
	public static int mult(int a, int b) {		
		if (a==1) {
			return b;			
		} else {			
			return b+(a-1)*b;
			
		}
	
	}

}
