package domain;

import java.awt.AWTEventMulticaster;

public abstract class Fahrzeug {
	private String kennzeichen;
	private String typ;
	private int kmStand;
	protected int wartungsIntervall = -1;
	private int kmLetzteWartung;
	
	
	public Fahrzeug(String kennzeichen, String typ, int kmStand) {
		super();
		this.kennzeichen = kennzeichen;
		this.typ = typ;
		this.kmStand = kmStand;
		kmLetzteWartung = kmStand;
	}
    
     public static Fahrzeug fahrzeugFabrik(String art,String kennzeichen,String typ, int kmStand, int zuladung, float beschleunigung) {
    	 
    	 if (art.equals("PKW"))
    		 return new Pkw(kennzeichen, typ, kmStand);
    	 
    	 if(art.equals("Lkw"))
    		 return new Lkw(kennzeichen, typ, kmStand, zuladung);
    	 if(art.equals("Motorrad"))
    		 return new Motorrad(kennzeichen, typ, kmStand, beschleunigung);
		return null;
    	 
     }
    //Platz wo abstracte Methode von andere Klassen ausgefuhrt wird
     abstract public void initializeWartungsvall();
     

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public int getKmStand() {
		return kmStand;
	}

	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}

	public int getWartungsIntervall() {
		return wartungsIntervall;
	}

	public void setWartungsIntervall(int wartungsIntervall) {
		this.wartungsIntervall = wartungsIntervall;
	}

	public int getKmLetzteWartung() {
		return kmLetzteWartung;
	}

	public void setKmLetzteWartung(int kmLetzteWartung) {
		this.kmLetzteWartung = kmLetzteWartung;
	}

    
}
