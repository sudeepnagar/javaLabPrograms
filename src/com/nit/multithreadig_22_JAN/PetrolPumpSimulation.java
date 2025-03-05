package com.nit.multithreadig_22_JAN;

public class PetrolPumpSimulation {

	public static void main(String[] args) {
		PetrolPump p=new PetrolPump();
		Car cars[]= {new Car("ferrari",p),new Car("Mahendra",p),new Car("lexus",p)};
        
		    Thread t[]=new Thread[5];//= {new Thread(cars[0]),new Thread(cars[1])};
		   // t[0].start();
		   // t[1].start();
				for(int i=0;i<cars.length;i++)
				{
				  t[i]=new Thread(cars[i]);
				  t[i].start();
				}
	           
	}

}
