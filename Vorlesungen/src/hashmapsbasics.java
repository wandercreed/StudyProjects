import java.util.HashMap;

public class hashmapsbasics {
      
	public static int sch = 1000;

	public static void main(String[] args) {

    /* HashMap<Integer, String> studenten = new HashMap<>();// hesh map initialisierung   
     studenten.put(123, "Hella Klar");
     studenten.put(124, "Penis Huy");
     studenten.put(125, "Curva Mach");
     System.out.println(studenten.get(123));//.get schlussel Wert mit Integer*/
		
		
		
     HashMap<Integer, Student> studenten = new HashMap<>();
    // studenten.put(1223, new Student(1223,"Penis Huy", "IMB"));//mit Objekt aus Student.java
     //studenten.put(1224, new Student(1224,"Penis Huy2", "IMB"));
    // studenten.put(1225, new Student(1225,"Penis Huy3", "IMB"));
    // int sch = 1000;
     int t = sch;
     for (int i = sch; i <= 10000; i++) { 
    	 
   	studenten.put(i, new Student(sch++,"Penis Huy1", "IMB"));
   	
   	System.out.println(studenten.get(i));
   	
     }
   
    // System.out.println(studenten.get(1000));
    // System.out.println(studenten.get(1001));
     //System.out.println(studenten.get(1002));
     //System.out.println(studenten.get(1003));
     //System.out.println(studenten.get(1004));
    // System.out.println(studenten);
}

    //System.out.println(studenten.get(1225));
     
	}


