package D_05_DEC;

class Account {
        private String accountNumber;
        private double balance;
        public Account(String accountNumber,double balance) {
        	this.accountNumber=accountNumber;
        	this.balance=balance;
        }
        
        public String getAccountNumber() {
        	return accountNumber;
        }
        
        public double getBalance() {
        	return balance;
        }
        
        public Account generateStatement() {
        	 System.out.println("Account Statement:");
             System.out.println("Account Number: " + accountNumber);
             System.out.println("Current Balance: $" + balance);
             return this;
        }
}
