package Test2;

public class AccountMain {

	public static void main(String[] args) {
		   System.out.println("Saving Acount Operations:");
            SavingAccount s=new SavingAccount(1000.0,1.0);
            System.out.println("Previous Balance:"+s.balance);
            s.deposit(200.0);
            s.calculateInterest();
            System.out.println("Saving Acount Balance:"+s.balance);
            
            System.out.println("========================");
            
            System.out.println("Checking Acount Operations:");
             CheckingAccount c=new CheckingAccount(1000.0);
             System.out.println("Previous Balance:"+c.balance);
             c.deposit(300.0);
             c.withdraw(100.0);
             System.out.println("Checking Account Balance:"+c.balance);
  
	}

}
