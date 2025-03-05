package Exception_handling_03JAN;

public class Customer {
	public String getName() {
		return name;
	}

	private String name;
	private BankAccount account;

	public Customer(String name,BankAccount account) {
		this.name = name;
		this.account=account;
		//BankAccount b = new BankAccount(64100712,80000);
		
	}
	
	public BankAccount getAccount() {
		return  account;
		
	}
	
     
	

}
