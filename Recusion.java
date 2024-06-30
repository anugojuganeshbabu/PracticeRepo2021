package com.test.practice;

public class Recusion {
	public static void main(String[] args) {
		String s = "Ganesh";
		//System.out.println(reverse(s));
		System.out.println(reverseRecursion(s));
	}
	
	private static String reverseRecursion(String s) {
		String result="";
		if(s.length()>0) {
			char ss = s.charAt(s.length()-1);
			result= (ss+""+reverseRecursion(s.substring(0,s.length()-1)));
		}
		return result;
	}

	public static String reverse(String s) {
		String reverse = "";
		System.out.println(new StringBuilder(s).reverse());
		for(int i=s.length();i>0;i--) {
			 System.out.println(s.charAt(i-1));//+""+reverse(s);
		}
		return reverse;
	}
}
