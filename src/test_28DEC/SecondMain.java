package test_28DEC;

abstract class BankAccount{
	String accountHolder;
	double balance;
	public BankAccount(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	public abstract void deposit(double amount) ;
	public abstract void withdraw(double amount);
	public abstract String displayAccountInfo();
	
	public String displayBalance() {
		return "current Balance is:"+ balance;
	}
}
class SavingAccount extends BankAccount{
 

	double interestRate;
     
    public SavingAccount(String accountHolder, double balance,double interestRate) {
		super(accountHolder, balance);
		this.interestRate=interestRate;
	}
	@Override
	public void deposit(double amount) {
		
		balance+=amount;
		System.out.println("amount deposited: "+balance);
	}

	@Override
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("amount withdrawn: "+balance);
	}

	@Override
	public String displayAccountInfo() {
		
		return "Account Holder name:"+accountHolder +" [ Balance]:"+balance;
	}
	
}

public class SecondMain {

	public static void main(String[] args) {
		BankAccount b=new SavingAccount("sudeep",5000,2);
		System.out.println(b.displayBalance());
		b.deposit(2000);
		b.withdraw(1000);
		
		System.out.println(b.displayAccountInfo());
		

	}

}
