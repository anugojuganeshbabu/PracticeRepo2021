package com.test.practice;

public class DeadLockTest {

	public static void main(String[] args) {
		
		DeadLockDemo d = new DeadLockDemo();
		Thread t1 = new Thread() {
			public void run() {
				d.method1();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				d.method2();
			}
		};
		
		t1.start();
		t2.start();
	}

}
