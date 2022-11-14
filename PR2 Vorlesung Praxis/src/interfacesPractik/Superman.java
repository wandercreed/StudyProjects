package interfacesPractik;


//Superman ist ein SINGELTON, also existiert nur 1 Intance
public class Superman implements Flieger {
    private static Superman instance = null;
	private Superman() {
		
	}
	public static Superman getInstance() {
		if(instance == null) {
			return new Superman();
		}
		return instance;

	}
	@Override
	public void starten() {
		System.out.println("los geht");
	}

	@Override
	public void landen() {

		System.out.println("ich lande");

	}

	@Override
	public void fliegen() {
		System.out.println("Juuuuuuuuu");
	}
	
	
	public void weltRetten() {
		System.out.println("Ich rette Das Welt");
	}

}
