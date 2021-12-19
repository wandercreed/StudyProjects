
public class vorlesungMethoden {

	public static void main(String[] args) {
		System.out.println(generiereZufallszahl(10));
		System.out.println(generiereZufallszahl(200,300));

	}
	
	
	public static int generiereZufallszahl(int n){
		
		
		
		return (int) (Math.random() * n);
	} 
	
public static int generiereZufallszahl(int a, int b){
		
		
		
		return (int) (Math.random() * (b-a)+1) + a;
	}

}
