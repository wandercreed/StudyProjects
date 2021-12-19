

import java.util.Scanner;

public class a2d {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Name: ");
        String name;
        name = input.nextLine();        
		//nameclear = name.toLowerCase(); 
		
		
		System.out.println("Height (m): ");		
		double height = input.nextDouble();
		
		
		System.out.println("Weight (kg): ");
		double weight = input.nextDouble();
	
	
		//height = height / 100;
		double bmi = weight / (height * height);

		System.out.println("Patient " + name + " mit Grosse " + height + "m " +  "und Gewicht von " + weight + "kg");
		System.out.printf("hat einen BMI von %.1f" , bmi);
		//System.out.println();
		
		if (bmi < 30) {
			System.out.print(" und darausfolgend hat Normalgewicht");

		} else if (bmi >= 30 && bmi < 35) {
			System.out.print(" und darausfolgend hat Adipositas Typ 1.");
			
		} else if (bmi >= 35 && bmi < 40) {
			System.out.print(" und darausfolgend hat Adipositas Typ 2.");
			
		} else if (bmi >= 40) {
			System.out.print(" und darausfolgend hat Adipositas Typ 3.");
		}

	}

}
