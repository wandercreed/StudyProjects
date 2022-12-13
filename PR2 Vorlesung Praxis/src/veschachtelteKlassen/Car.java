package veschachtelteKlassen;

import javax.print.attribute.standard.MediaSize.Engineering;

public class Car {
   
	 private int mileage = 0;
	 private Engine engine;
	 
	 
	 private class Engine {
		 private int mileage = 0;
		 
	 }
	 
	 public Car() {
		 replaceEngine();
	 }
	 
	 public void replaceEngine() {
			engine = new Engine();
			
			
		}
	 public String toString() {
		 return "Mileage " + mileage + "\nEnigne mileage" + engine.mileage;
		 
	 }


}
