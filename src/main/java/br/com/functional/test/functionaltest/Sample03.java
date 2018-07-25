package br.com.functional.test.functionaltest;

import java.util.Arrays;
import java.util.List;

public class Sample03 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		
		int factor = 2;
		
		numbers.stream()
			.map(e -> e * factor)
			.forEach(System.out::println);
		
		 // This lambda has to close-over it defining scope looking for
		//              the variable factor to bind to - closure
		
		// lambdas are stateless
		// closure has (immutable state)
	}

}
