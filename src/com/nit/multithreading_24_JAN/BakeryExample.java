package com.nit.multithreading_24_JAN;

public class BakeryExample {

	public static void main(String[] args) {
		Bakery b=new Bakery();
		Baker ba=new Baker(b);
		Thread t=new Thread(ba);
		t.start();
		
		Customer c1=new Customer(b,"sudeep");
		Customer c2=new Customer(b,"soumy");
		Thread t1[]= {new Thread(c1),new Thread(c2)}; 
		
		for(Thread t2:t1) {
			t2.start();
		}

	}

}
