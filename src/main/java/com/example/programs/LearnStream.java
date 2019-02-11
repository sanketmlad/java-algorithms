package com.example.programs;

import java.util.Arrays;
import java.util.List;

public class LearnStream {
	public static void main(String[] args) {
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);
		List<Integer> intArray = Arrays.asList(1, 3, 5, 2, 8, 4);
		intArray.stream().filter(s -> s%2 ==0).forEach(System.out::println);
		List<String> strArray = Arrays.asList("my", "name", "is", "Sanket");
		strArray.stream().filter(s -> Character.isUpperCase(s.charAt(0))).forEach(System.out::println);	
		
		strArray.forEach(System.out::println);
	}	
}
