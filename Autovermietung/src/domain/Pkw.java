package domain;

public class Pkw extends Fahrzeug{

	public Pkw(String kennzeichen, String typ, int kmStand) {
		super(kennzeichen, typ, kmStand);
	}
   
    @Override
    public void initializeWartungsvall() {
    	wartungsIntervall = 35000;
    }
}
