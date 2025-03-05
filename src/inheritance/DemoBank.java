package inheritance;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               CheckingAccount c=new CheckingAccount(1455556, 5000, 2000);
               c.withdraw(2500);
               c.deposit(6000); 
               System.out.println(c.toString());
	}

}
