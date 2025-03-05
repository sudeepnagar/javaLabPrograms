package com.nit.multithreading_24_JAN;

public class Example {
	
	public static void main(String[] args) {
		Runnable r1 = ()->System.out.println("Core Java");
		Runnable r2 = ()->System.out.println("Advanced Java");
		Runnable r3 = ()->System.out.println("Oracle");
		
		Thread[] threadArr = {new Thread(r1), new Thread(r2), new Thread(r3)};
		
		for(Thread t : threadArr) {
			t.start();
		}
	}

}
