package datenstrome;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMindestens5Zeichen {

	public static void main(String[] args) {
		 Stream<String> liste = Stream.of("Aasdf", "asdfASDFas", "dfg","s", "adfFaq", "SDFDSDS","Aasdf");
		 
//		 List<String> s = liste.filter(k -> k.length()>=5)
//				 .map(k -> k.toLowerCase())
//				 .collect(Collectors.toList());
//		 
//		 System.out.println(s);
		 
		 Map<List<String>, Long> b = liste.map(x -> Arrays.stream(x.split(" ")))
				 .collect(Collectors.groupingBy(s-> s.toList(), Collectors.counting()));
		 
		 
//		 Map<Stream<String>, Long> b = liste.map(x -> Arrays.stream(x.split(" ")))
//				 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 
		 System.out.println(b);
		 
	}

}
