package com.test.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCount {
	public static void main(String[] args) {
		//String s = "manojpandey";
		String s1 = "Ganesh Babu Babu Gani";
		Set<String> set = new HashSet<>();
		//List<String> l = Arrays.asList(s.split(""));
		List<String> l = Arrays.asList(s1.split(" "));
		
		String duplicates =  l.stream().filter(x->!set.add(x)).collect(Collectors.joining(","));
		System.out.println(duplicates);
	}
}
