package lambdasPractice;

public class FIDemo {

	
	public static void main (String[] args) {
		
		
		
		Funktion f = (int a,int b) ->{
			return a+b;
		};
//Option ohne Lambda		
//		Funktion funktion = new Funktion() {
//Anonyme innere Klasse
//			@Override
//			public int sdf(int a, int b) {
//				// TODO Auto-generated method stub
//				return a+b;
//			}
//			
//		};
		System.out.println(f.sdf(1,1));
	}
}
