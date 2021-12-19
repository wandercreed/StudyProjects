import java.util.Scanner;

public class Student {
       
	public int matrikelnummer;
    public String name;
    public String studiengang;
    public static String instution = "Hochschule Mannheim";
	
	
	 Student (int matrikelnummer, String name, String studiengang) {// Konstruktor
		
		 this.matrikelnummer = matrikelnummer;
		 this.name = name;
		 this.studiengang = studiengang;
   	
    }
	 
	 public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			Student studi1 = new Student(12345, "Ali Gator", "UIB");
			Student studi2 = new Student(4444, "Hela SUckdick", "UIB");
			
			System.out.println(studi1.toString());
			System.out.println(studi2.toString());
		}
	 
	 
	 public String toString() {
		 
		 String output = "Student: " + this.name;
		 
		 output += ", Matrikelnummer: " + this.matrikelnummer;
		 
		 output += ", studiert Studiengang : " + this.studiengang;
		 
		return output;
		 
	 }
	 

}
