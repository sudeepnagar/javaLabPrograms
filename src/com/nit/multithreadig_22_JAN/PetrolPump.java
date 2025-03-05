package com.nit.multithreadig_22_JAN;

public class PetrolPump {
          public synchronized void refillCar(String carName)
          {
        	  System.out.println(carName+" started refilling...");
        	  System.out.println(carName+"completed refilling!.");
        	  try 
        	  {
				Thread.sleep(3000);
			  } 
        	  catch (InterruptedException e) 
        	  {
				e.printStackTrace();
			  }
          }
}
class Car implements Runnable{
       
	String name;
	PetrolPump petrolPump;
	
	

	public Car(String name, PetrolPump petrolPump) {
		super();
		this.name = name;
		this.petrolPump = petrolPump;
	}

	@Override
	public void run() {
		petrolPump.refillCar(name);	
	}
	
}
