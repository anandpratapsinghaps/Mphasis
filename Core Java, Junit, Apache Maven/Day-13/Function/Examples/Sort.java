package com.examples.functions;

import java.util.Arrays;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 1, 3, 2, 4);

		List<Integer> sorted = nums.stream()
		                           .sorted()
		                           .toList();

		System.out.println(sorted); // [1, 2, 3, 4, 5]


	}

}
