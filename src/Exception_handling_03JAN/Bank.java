package Exception_handling_03JAN;

public interface Bank {
        public void deposit(double amount) throws InvalidAmountException;
        public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;
        public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException;
        public void applyForLoan(double amount) throws LoanNotAllowedException,InvalidAmountException;
        
        public double getBalance();
}
