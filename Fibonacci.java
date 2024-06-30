package com.test.practice;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 1, b = 1, c;

		System.out.println(a+" "+b);
//		for (int i = 1; i <= 10; i++) {
//			c = a + b;
//			a = b;
//			b = c;
//			System.out.println(c);
//		}
		
	int result=	fibonacii(a,b);
	}

	
	public static int fibonacii(int a, int b) {
		int d = a + b;
		a = b;
		b = d;
		if(d!=21) {
			System.out.println(d);
			return fibonacii(a,b);
		}
		return 0;
	}
	
}
