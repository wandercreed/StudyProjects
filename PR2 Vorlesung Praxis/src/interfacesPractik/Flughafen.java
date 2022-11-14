package interfacesPractik;

import java.util.ArrayList;

public class Flughafen {

	public static void main(String[] args) {

		ArrayList<Flieger> flugplan = new ArrayList<>();

		
		
		Flieger superman = Superman.getInstance();
		superman.starten();
		
		//Aufruf von die Methode, die kein Teil der Interface ist
		if (superman instanceof Superman) {
			((Superman) superman).weltRetten();
		}
		
		

		Flieger flieger = new Flugzeug();
		flieger.fliegen();
	}

}
