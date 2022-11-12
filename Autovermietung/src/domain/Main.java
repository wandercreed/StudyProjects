package domain;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
    HashMap<String, Fahrzeug> fuhrpark = new HashMap<>();
    fuhrpark.put("MA-MA 123", new Pkw("MA-MA 123", "Porsche",83));
    
    //Abstacte Methode initialisation
    fuhrpark.put("KA-KA 123", Fahrzeug.fahrzeugFabrik("PKW", "KA-KA 123", "Ente", 34, -1, -1f));
    
    //Itterate over a HashMap
    for(String s : fuhrpark.keySet()) {
    	System.out.println(s);
    }
    }

}
