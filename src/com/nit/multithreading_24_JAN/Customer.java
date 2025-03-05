package com.nit.multithreading_24_JAN;

public class Customer implements Runnable{
    Bakery bakery;
    String customerName;
    
	
	public Customer(Bakery bakery, String customerName) {
		super();
		this.bakery = bakery;
		this.customerName = customerName;
	}
    
	

	@Override
	public void run() {
		try
		{
			bakery.buyGoods(customerName);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
         
}
