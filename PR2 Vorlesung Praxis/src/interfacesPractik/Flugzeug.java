package interfacesPractik;

public class Flugzeug implements Flieger {
	
	
	private int maxSpeed = 999;
    private String direction1;
    
   
     
     public void fliegen(int speed, String direction) {
    	maxSpeed  = speed;
    	direction1 = direction;
     }
     
	@Override
	public void starten() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void landen() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fliegen() {
		System.out.println("Ich bin Flugzeug, ich fliege bis zu " + maxSpeed);
		
	}
}
