
public class a4d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //int position = 0;
  
    String[] Kaiserliste = {"Gaius Octavius Augustus",
    		"Tiberius Caeser Augustus",
    		"Gaius Caesar Augustus Germanicus",
    		"Tiberius Klaudius Nero Germanicus",
    		"Nero Claudius Caesar Augustus Germanicus"};
    
    int kaiserNummer = 1;
    for (String kaiserName:Kaiserliste) {
    	System.out.println("Kaiser" + kaiserNummer++ + ":" + kaiserName);
    	int einzelNameNummer = 1;
    	for (String einzelName : kaiserName.split(" ")) {
    		System.out.println("   " + einzelNameNummer++ + ". Name : " + einzelName);
    	}
    }
    		
    //System.out.println("Kaiser 1: " + Kaiser1);
    //for (int i = 0;i<Kaiser1einzeln.length;i++) {
   // 	position = i + 1;
   // System.out.println(position + ". Name ist "+  Kaiser1einzeln[i]);

    }

	}


