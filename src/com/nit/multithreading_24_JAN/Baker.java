package com.nit.multithreading_24_JAN;

public class Baker implements Runnable{
       Bakery bakery;

	public Baker(Bakery bakery) {
		super();
		this.bakery = bakery;
	}

	@Override
	public void run() {
		
		while(!bakery.isProductionFinished())
		{
			try 
			{
				bakery.bakeGoods();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("For today, we are finsher our production");
	}
       
      
} 
