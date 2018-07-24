package br.com.functional.test.functionaltest;

import java.util.Arrays;
import java.util.List;

public class Sample02 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("---- find the total of double of even numbers -- imperative style");
		System.out.println("---- imperative style = how to do things");
		int result = 0;
		for (int e : numbers) {
			if (e % 2 == 0) {
				result += e * 2;
			}
		}
		System.out.println(result);
		
		System.out.println("---- find the total of double of even numbers -- functional style");
		System.out.println("---- functinal style = what to do things");
		System.out.println(
				numbers.stream()
				.filter(e -> e % 2 == 0)
				.mapToInt(e -> e * 2)
				.sum()
		);
		
	}

}
