package veschachtelteKlassen;

public class X {

	public static void main(String[] args) {
		Object o = new Object() {//INNERE Instanz 
			public String toString() {
				return "Pula von Innen";
			}
			
			
		};
		
    System.out.println(o.toString());
	}

}
