import java.util.Arrays;

public class a4f {

	public static void main(String[] args) {
    String[] Kaiserliste = {"Gaius Octavius Augustus",
    		"Tiberius Caeser Augustus",
    		"Gaius Caesar Augustus Germanicus",
    		"Tiberius Klaudius Nero Germanicus",
    		"Nero Claudius Caesar Augustus Germanicus"};
    int position = 1;
    int kaiserNummer = 1;
    for (String kaiserName:Kaiserliste) {
    	System.out.println("   ");
    	System.out.println("Kaiser" + kaiserNummer++ + ":" + kaiserName + "--->" );

    	String kaiserNamesmall = kaiserName.toLowerCase();
    	position = 0;
    	for (String einzelNamen : kaiserNamesmall.split(" ")) {
    		char[] chararray = einzelNamen.toCharArray();
    		position++;
    		for (int k = 0; k<chararray.length;k++) {
    			int randomIndex = (int)(Math.random()*chararray.length);
    			char temp = chararray[k];
    			chararray[k] = chararray[randomIndex];
    			chararray[randomIndex] = temp;
        		
    		}
    		
    	
    		System.out.print("   ");
    		System.out.println(position + ". Name: " + Arrays.toString(chararray));
    		//System.out.print(chararray);   		
    		

    	}

    }
    
    
    
    
    //System.out.println("Kaiser 1: " + Kaiser1);
    //for (int i = 0;i<Kaiser1einzeln.length;i++) {
   // 	position = i + 1;
   // System.out.println(position + ". Name ist "+  Kaiser1einzeln[i]);

    }

	}


