package inheritance;

class BankAccount {
           int accountNumber;
           double balance;
		
           public BankAccount(int accountNumber, double balance) {
			super();
			this.accountNumber = accountNumber;
			this.balance = balance;
		}
           
           void deposit(double amount) {
        	   if(this.balance>=amount) {
        	   this.balance=this.balance-amount;
        	   }
        	   else {
        		   System.err.println("Insuffisicient funds");
        	   }
           }
           
}
class SavingAccount extends BankAccount{
	
	double interestRate;

	public SavingAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	void addInterest() {
		
	}
	
	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + ", accountNumber=" + accountNumber + ", balance="
				+ balance + "]";
	}

}

class CheckingAccount extends BankAccount{

	double overdraftLimit;

	public CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	void withdraw(double amount) {
		if(this.overdraftLimit<=3000) {
			this.balance=this.balance-amount;
		}
		else {
			System.err.println("Exceeds overdraft limit");
		}
	}
	
	@Override
	public String toString() {
		return "CheckingAccount [overdraftLimit=" + overdraftLimit + ", accountNumber=" + accountNumber + ", balance="
				+ balance + "]";
	}

}
