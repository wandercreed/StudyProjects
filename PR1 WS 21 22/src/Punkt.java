import java.util.ArrayList;

public class Punkt {

	public int x;
	public int y;		

	Punkt (int x, int y){
		this.x = x;
		this.y = y;
	
	}
	
	public String toString() {		
		String output = "(x = " + this.x + ", y= " + this.y + ")";		
		return output;		
	}

	
	public void setX(int x){
		this.x = x;		
	}
	public void setY(int y){
		this.y = y;		
	}

	


}
