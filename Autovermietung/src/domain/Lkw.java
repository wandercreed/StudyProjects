package domain;

public class Lkw extends Fahrzeug {

	public Lkw(String kennzeichen,String typ, int kmStand, int zuladung) {
		super(kennzeichen,typ,kmStand);
		this.zuladung = zuladung;
	}
	private int zuladung;
	
	
	public void setZuladung(int zuladung){
		this.zuladung = zuladung;
	}
	
	@Override
	public void initializeWartungsvall() {
		wartungsIntervall = 20000;
	}

}
