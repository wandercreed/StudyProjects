package datenstrome;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GoldKunden {

	public static void main(String[] args) {
		Stream<Integer> kunden = Stream.of(
				23428, 10234, 7123, 1, 0, -100,
				55555, 65000, 100100, 222222, 255000,
				300000, 1337000);
		
		
		Map<Levels, List<Integer>> levels = kunden.collect(Collectors.groupingBy(ks -> {
			if(ks< 25000) return Levels.normal;
			
			if(ks< 100000) return Levels.aktiv;
			
			if(ks < 250000) return Levels.gold;
			
			return Levels.platinum;
			
		}));
		
		System.out.println(levels.getClass().getName());
		System.out.println(levels);
	}

}


enum Levels {
	normal,aktiv,gold,platinum
}