package lambdasPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.ToIntBiFunction;
import java.util.stream.Stream;
import java.util.stream.Collector;


public class LambdaTests {

	public static void main(String[] args) {
		/*List Aufruf und ausgabe*/
		List<String> testList = Arrays.asList("CD","KGG","P","AGGG","B","C","D");
		testList.stream().filter(buckstabe -> buckstabe.matches("C")).forEach(System.out::println);
//		testList.stream().forEach(letter -> System.out.println(letter));		
        
		/*Lambda Aufruf und verwendung*/
		testList.forEach((String s) -> {			
			if(s.contains("G")) System.out.println(s);});

		/*Stream modifizierte Ausgabe*/
		Stream<String> testStream = Stream.of("CD","KGG","P","AGGG","B","C","D");
		testStream.map(letter -> letter.toLowerCase()).forEach(System.out::print);
		
		/*Binary Operator*/
		IntBinaryOperator f = (a,b) -> {return a+b;};
		int i = f.applyAsInt(1, 2);
		System.out.println();
		System.out.println("IntBinaryOperator Test " + i);
		
		/*Predicates liefert true oder false zurück*/
		IntPredicate auto = (a) -> {return a>18;};
		System.out.println("Alt genug für Führerschein result: " + auto.test(17));
		System.out.println("Alt genug für Führerschein result: " + auto.test(19));
		
		/*SUPPLIER liefern wert zurück ohne Parameter einzugeben*/
		IntSupplier würfel = () -> {return (int)(Math.random() *6 +1);};
        System.out.println("Würfel Test: " + würfel.getAsInt());
		
        /*Liste von Integer AUFSUMMIEREN mit hilfe von .reduce*/
        List<Integer> al = Arrays.asList(3,7,2,1,8,4,5);
        System.out.println(al.stream().reduce(0, (k,p) -> k+p) );//0 hier als Starter parameter
        
        /*Liste durchgehen*/
       final String hello = "Hello";
        al.forEach(h -> System.out.println(hello + " " +h));
}}
