package domain;

public class Motorrad extends Fahrzeug{

	public Motorrad(String kennzeichen,String typ, int kmStand, float beschleunigung) {
		super(kennzeichen, typ, kmStand);
	     this.beschleunigung = beschleunigung;

}
	private float beschleunigung;
    
	@Override
	public void initializeWartungsvall() {
		wartungsIntervall = 5000;
	}
}
