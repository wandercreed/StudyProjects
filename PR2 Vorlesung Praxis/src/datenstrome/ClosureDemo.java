package datenstrome;

import java.util.stream.Stream;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors.*;
public class ClosureDemo {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Kai","Anton", "Egon", "Alfred","Klaus","Bar");
      final MerkerKlasse mk = new MerkerKlasse();
      final List<String> ll = new LinkedList<>();
      
      
      stream.filter(s -> {
    	  if(mk.afb== null) {
    		  mk.afb = "" +s.charAt(0);
    		 
    	  }
    	  System.err.println(mk.counter++ + " : " + mk.afb);
    	  return s.startsWith(mk.afb);//.startsWith() liefert hier zurück ein True oder False wenn die Buchstabe vorkommt
      }).forEach(s -> ll.add(s));//so speichert man die Daten von einem Stream in LinkedList
      
      System.out.println(ll);
	}
}

class MerkerKlasse{
	 String afb = null;
	 int counter = 1;
	
}