package vererbung2022;

public class FreierMitarbeiter extends Mitarbeiter {
    private String status;
	public FreierMitarbeiter(String name, double gehalt, String gebDatum, String status) {
		super(name, gehalt,gebDatum);
		this.status = status;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Status: " + status;
	}

}
