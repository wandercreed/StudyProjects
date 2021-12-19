
public class rekursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int f = fak(4);
		System.out.println(f);
	}
	
	public static int fak (int n) {
		
		if(n == 1) {
			return 1;
		} else {
			
			return n * fak(n-1);
		}
		
		
	}
	
	

}
