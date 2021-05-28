package com.myit.general;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GenStream {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		List<String> filtered = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println("filtered : "+filtered);
		
		filtered.stream().forEach(a -> System.out.println(a));
		
		long total = strings.stream().filter(s -> !s.isEmpty()).count();
		System.out.println("total : "+total);
		
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println("squaresList : "+squaresList);

		
		List<String> s1 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		long count = s1.stream().filter(s -> s.isEmpty()).count();
		System.out.println("count : "+count);
		
		
		Random r = new Random();
		r.ints().limit(10).sorted().forEach(x->System.out.println(x));
		
		List<String> p1 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		long c = p1.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println("c : "+c);
		
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		
        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());






	}
	
}
