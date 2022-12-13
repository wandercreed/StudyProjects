package datenstrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class datenStromePractice {

	public static void main(String[] args) {
		
		
		Stream<String> stream = Stream.of("Anton", "Egon", "Alfred","Klaus");
		//Eine iteration und modification von einem Stream
		stream.map(n -> n.length()).filter(z->z>4).map(z -> z*z).forEach(System.out:: println);
	

		/*IntStream Array in einer ArrayListe speichern IntStream.rangeClosed(1, 50)  */
		ArrayList<Integer> testArrayList = new ArrayList<>();
		
		//List<IntStream> t = Arrays.asList(IntStream.rangeClosed(1, 50).filter(zahl -> zahl >30).forEach(System.out:: println));		
		IntStream.rangeClosed(1, 50).filter(zahl -> zahl >30)
		.forEach(x -> testArrayList.add(x));        
		//testArrayList.stream().forEach(System.out:: println); 
		
		
		IntStream.rangeClosed(1, 50).filter(zahl -> zahl%2==0).forEach(System.out:: println);
		/*Iterate mit einem Limit von 10 mal die Lambda Ausdrück ausgeben*/
		//IntStream.iterate(0, i -> i+5).limit(10).forEach(System.out:: println);
		
		
	}

}
