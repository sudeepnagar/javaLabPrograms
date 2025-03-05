package Test2;

public class SavingAccount extends BankAccount{
         private double interestRate;

         
         public SavingAccount(double balance, double interestRate) {
			super(balance);
			this.interestRate = interestRate;
		}

		public void calculateInterest() {
 			double interest=balance*interestRate/100;
 			balance+=interest;
 			System.out.println("Interest Added:"+interest);         }
}
