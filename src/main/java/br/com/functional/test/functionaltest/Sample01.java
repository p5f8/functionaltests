package br.com.functional.test.functionaltest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample01 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// familiar for loop and not easy
		System.out.println("----------------external iterators");
		for(int i = 0 ; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
		System.out.println("--------------internal iterators");
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer e) {
				System.out.println(e);
			}
		});
		
		// functional interfaces
		System.out.println("---- functional interfaces");
		numbers.forEach((Integer e) -> System.out.println(e));
		
		System.out.println("------------type inferred by java");
		numbers.forEach(e -> System.out.println(e));
		
		System.out.println("------------methods references");
		numbers.forEach(System.out::println);
	}
	
}
