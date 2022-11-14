package vererbung2022;

public class Manager extends Mitarbeiter{
 private String abteilung;
 
	public Manager(String name, double gehalt, String geburtsdatum, String abteilung) {
		super(name,gehalt,geburtsdatum);
		this.abteilung = abteilung;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Abteilung: " +  abteilung;
	}

}
