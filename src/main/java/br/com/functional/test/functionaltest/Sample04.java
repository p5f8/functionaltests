package br.com.functional.test.functionaltest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample04 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		
		int factor = 2;
		// int[] factor = new int[] { 2 };
		
		Stream<Integer> stream = numbers.stream()
				                    .map(e -> e * factor); // lazy evaluation
		                            //.map(e -> e * factor[0]); // lazy evaluation
		
//		factor = 4;
//		factor[0] = 4;
		
		// Polymorphism is to object-oriented programming 
		// like
		// lazy evaluation is to functional programming
		
		stream.forEach(System.out::println);
	}

}
