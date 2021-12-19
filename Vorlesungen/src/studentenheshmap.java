import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class studentenheshmap {

	public static void main(String[] args) throws IOException {

	   HashMap<Integer,Student> studenten = new HashMap<>();
	   ArrayList<String> lines = new ArrayList<>();
	   //System.out.println(lines);
	   Student student = null;// Objekt angelegt
	   String filename = "src/studenten.txt";	   
	   Scanner scan = new Scanner(new File(filename));
	   
       while (scan.hasNextLine()) {
    	   
    	   String str = scan.nextLine();
    	   lines.add(str);
       }
       
	   for (String line : lines) {
		   String elems[] = line.split(";");
		   
		   int matrikelnummer = Integer.parseInt(elems[0]);// wird als Schlussel verwendet	
		   String name = elems[1];		 
		   String studiengang = elems[2];
		   student = new Student(matrikelnummer, name, studiengang);// Objekt angelegt und wird jeder durchgang uberschrieben	
		   
		   studenten.put(matrikelnummer, student);
	   }
	   
	   System.out.println(studenten.get(1238));
	   
	}
	
	
}
