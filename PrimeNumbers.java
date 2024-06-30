package com.test.practice;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sample test");

		int count = 1;

		for (int i=3;i<30;i++) {
			count=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count>1) {
				//System.out.println(i+"is not a prime number");
			}else {
				System.out.println(i);//+"is prime number");
			}
		}
		

	}

}
