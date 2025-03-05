package com.nit.multithreading_21_JAN;

public class Account {
           private int balance=0;
           
           public synchronized void withdraw(int amount) 
           {
        	   while(amount>this.balance) 
        	   {
        		   System.out.println(Thread.currentThread().getName()+" entered");
        		   try 
        		   {
        			System.out.println("Amount is not sufficient !");
        			System.out.println("Please wait for deposite!");
					wait();
				   } 
        		   catch (InterruptedException e) 
        		   {
					e.printStackTrace();
				   }
        	   }
        	   this.balance=this.balance-amount;
        	   System.out.println("Amount after withdrawll:"+this.balance);
        	   notify();
           }
           
           public synchronized void deposite(int amount) 
           {
        	   this.balance=this.balance+amount;
        	   System.out.println(Thread.currentThread().getName()+" entered");
        	   System.out.println("Amount after deposite:"+this.balance);
        	   notify();
           }
}

class Drawer extends Thread{
	      private Account account;

		public Drawer(Account account) {
			super();
			this.account = account;
		}
	      
		@Override
		public void run()
		{
			int []withdr= {2000,4000};
			for(int amt:withdr)
			{
			   account.withdraw(amt);
			   try 
    		   {
				   sleep(1000);
			   } 
    		   catch (InterruptedException e) 
    		   {
				
				e.printStackTrace();
			   }
			}
		}
}
class Depositor extends Thread{
	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run()
	{
		int []depo= {50,3000};
		for(int amt:depo)
		{
		   account.deposite(amt);
		   try 
		   {
			sleep(1000);
		   } 
		   catch (InterruptedException e) 
		   {
			
			e.printStackTrace();
		   }
		}
	}
	
}



