
public class a8cdAuto {
    
    public String kennzeichen; //globale Variablen
    public String model;
    public int killometerstand;
    public static int counter = 0;
    
    a8cdAuto (String zeichen, String mod, int stand){//Konstruktor
    	
    	this.kennzeichen = zeichen;
    	this.model = mod;
    	this.killometerstand = stand;
    	
    	counter++;
    }
   
	public static void main(String[] args) {
		
		a8cdAuto auto1 = new a8cdAuto("MX100", "Audi A3", 65173);
		a8cdAuto auto2 = new a8cdAuto("AB222", "Audi A4", 43760);
		
		System.out.println(auto1);
		System.out.println(auto2);
		
		System.out.printf("%d Objekte wurden gezaehlt \n ", a8cdAuto.liesAnzahlFahrzeuge());
		//System.out.printf("%d Objekte wurden gezaehlt \n ", counter);
	}
	
	public static int liesAnzahlFahrzeuge() {
		
		return counter;
	}
	
	public String toString() {
		String output = this.model;
		output +=   " mit Kennzeichen: " + this.kennzeichen;
		output += " und  Killometerstand  " + this.killometerstand;
		
		return output;
		
	}

}
