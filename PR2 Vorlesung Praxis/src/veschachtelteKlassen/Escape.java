package veschachtelteKlassen;

public class Escape {
   
	public static Object escape() {
		
		class Papillon {
			public String toString() {
				return "Ich bin geflohen ";
			}
		}
		
		
		return new Papillon();

		
	}
	
	Object object = Escape.escape();//Von Aussen kann aufgerufen werden
}


