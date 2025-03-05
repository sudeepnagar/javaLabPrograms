package Test2;

class BankAccount {
           protected double balance;

		public BankAccount(double balance) {
			super();
			this.balance = balance;
		}
          public void deposit(double amount) {
        	  if(amount>0) {
        		  this.balance+=amount; 
            	  System.out.println("Deposited:"+amount);

        	  }
        	  else {
        	  System.out.println("Invalid deposited amount");
        	  } 
          }
          
          public void withdraw(double amount) {
        	  if(amount>0&&this.balance>=amount) {
        		  this.balance-=amount;
        		  System.out.println("Withdrawn: " + amount);
        	  }
        	  else {
        		  System.out.println("insufficient balance or invalid withdrawal amount");
        	  } 
        	 
          }
          public void displayBalance() {
              System.out.println("Balance: " + balance);
          }
}
