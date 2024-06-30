package com.test.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCount {
	public static void main(String[] args) {
		String s = "manojpandey";
		char[] c = s.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		List l = (List) Arrays.asList(c);
		
	
	System.out.println(l);
	}
}
