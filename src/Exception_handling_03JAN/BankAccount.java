package Exception_handling_03JAN;

public class BankAccount implements Bank {

	private long accNo;
	private double balance;
	
	public BankAccount(long accNo, double balance) {
		super();
		this.setAccNo(accNo); 
		this.setBalance(balance);
	}

	@Override
	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Amount should be greater than 0");
		} else {
			this.balance += amount;
		}

	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Amount should be greater than 0");
		} else if (amount > this.balance) {
			throw new InsufficientFundsException("Insufficient amount!");
		} else {
			this.balance -= amount;
		}

	}

	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException {

		if (toAccount.accNo <= 0 || toAccount == null) {
			throw new AccountNotFoundException("Account is Not Found!");
		} else if (amount > this.balance) {
			throw new InsufficientFundsException("Insufficient funds!");
		} else if (amount <= 0) {
			throw new InvalidAmountException("Amount should be greater than 0");
		} else {
			this.balance-=amount;
			toAccount.balance+=amount;
		}
	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		if (amount > 25000) {
			throw new LoanNotAllowedException("Loan amount Exceeds the limit!");
		} else if (amount <= 0) {
			throw new InvalidAmountException("Amount should be greater than 0");
		} else {
			this.balance+=amount;
		}

	}

	@Override
	public double getBalance() {
		return this.balance;
	}
	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


}
