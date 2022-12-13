package datenstrome;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class BuchstabenZaehlen {

	public static void main(String[] args) {

     Stream<String> liste = Stream.of("AasdfasdfASDFasdfgsadfFaqASDFDSDS");
     
     Map<Boolean, Long> map = liste.map(String :: chars)
    		 .flatMap(is -> is.mapToObj(c ->(char)c))
    		 .collect(Collectors.groupingBy
    				 (Character :: isLowerCase,
    				  Collectors.counting()));
     
          Long t = map.get(true);
          System.out.println(t);
     
	}

}
