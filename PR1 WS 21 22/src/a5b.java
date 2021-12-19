import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a5b {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("src/namen1.txt"));
		Scanner scanner2 = new Scanner(new File("src/namen2.txt"));
		
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        while (scanner.hasNext() && scanner2.hasNext()) {
        	String liste1 = scanner.nextLine();
        	String liste2 = scanner2.nextLine();
        	list1.add(liste1);
        	list2.add(liste2);
        	
        }	  
	    list1.removeAll(list2);	   
	    System.out.println("Unique Namen aus die Listen namen1 und namen2 " + list1);
  
		}

	}


