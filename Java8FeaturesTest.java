package com.test.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8FeaturesTest {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Raama", "MANAGER");
		Employee e2 = new Employee(2, "seetha", "ASST MANAGER");
		Employee e3 = new Employee(3, "Lakshman", "AUDIT");
		Employee e4 = new Employee(1, "Raama", "MANAGER");
		Employee e5 = new Employee(5, "seethakka", "ASST MANAGER");
		Employee e6 = new Employee(6, "Hanuma", "AUDIT");
		
		Set<Employee> set = new HashSet<Employee>();
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1); empList.add(e2); empList.add(e3); empList.add(e4); empList.add(e5); empList.add(e6); 
		
		System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getEmpDept)));
			
		
		List syncList=  Collections.synchronizedList(empList);
		
		set.addAll(empList);
		
		set.stream().forEach(System.out::println);
		
		
		//empList.stream().forEach(x->System.out.println(x));
		//empList.stream().forEach(System.out::println);
		
		//empList.stream().filter(x->x.getEmpName().startsWith("Ra")).collect(Collectors.toList()).forEach(System.out::println);
		
		//empList.stream().map(x->x.getEmpName()).collect(Collectors.toList()).forEach(System.out::println);
		
		String s = empList.stream().map(x->x.getEmpName()).collect(Collectors.joining(","));
		
		///empList.stream().collect(Collectors.groupingBy(Employee::getEmpDept)).forEach((k,v)->System.out.println(k+" "+v));
		
		empList.stream().collect(Collectors.groupingBy(Employee::getEmpDept))
		.forEach((k,v)->{
				 String s1 = v.stream().map(x->x.getEmpName()).collect(Collectors.joining(","));
				 System.out.println(k+"=>"+s1);
		});
		
		String string="Raama";
		
		String subString = string.substring(1, 5);
		System.out.println(subString);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		System.out.println(numbers.stream().mapToInt((x) -> x).sum());
		
		//Example on flatMap
		List<String> ind = Arrays.asList("A","B","C");
		List<String> pak = Arrays.asList("D","E","F");
		List<String> eng = Arrays.asList("G","H","I");
		
		List<List<String>> worldPlayers = Arrays.asList(ind,pak,eng);
		System.out.println(worldPlayers);
		List<String> allPlayers = worldPlayers.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(allPlayers);
	}
}
