package vererbung2022;

public class Mitarbeiter {
 private String name;
 private double gehalt;
 private String geburtsdatum;
 
 public Mitarbeiter(String name, double gehalt, String geburtsdatum) {
	 this.name = name;
	 this.gehalt = gehalt;
	 this.geburtsdatum = geburtsdatum;
 }
 
 @Override
 public String toString(){
	return "Name: " + name + ", Geb.: " + geburtsdatum  + ", Gehalt: " + gehalt;
	 
 }
}
