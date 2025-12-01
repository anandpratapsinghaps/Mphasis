package com.examples.functions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Filter {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sam", "John", "Steve");

		Optional<String> result = names.stream()
		                               .filter(n -> n.startsWith("S"))
		                               .findFirst();

		System.out.println(result.get()); // Sam


	}

}
