package vererbung2022;

public class HrSystem {

	public static void main(String[] args) {
		Mitarbeiter mi = new Mitarbeiter("A",3500.0,"12.06.1998");
		System.out.println(mi.toString());
		
		Manager ma = new Manager("B", 5000.0,"13.07.1998","Sales");		
		System.out.println(ma.toString());
		
		GeshaeftsFurhrer gf = new GeshaeftsFurhrer("C", 7000.0,"14.08.1998", "Leitung");		
		System.out.println(gf.toString());
		
		FreierMitarbeiter fm = new FreierMitarbeiter("D", 4000.0, "15.09.1998", "Outsource");		
		System.out.println(fm.toString());

	}

}
