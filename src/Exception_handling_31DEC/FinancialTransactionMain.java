package Exception_handling_31DEC;

class FinancialTransaction{
	public void processTransaction(double amount, long accountNumber) throws  IllegalArgumentException
	{
		if(amount<0) {
			throw new IllegalArgumentException();
		}
		else {
			System.out.println("Processing transaction...");
			System.out.println("Transaction successfull: amount Rs."+ amount +" transferred to account "+accountNumber);
		}
	
	}
}

public class FinancialTransactionMain {

	public static void main(String[] args) {
		FinancialTransaction f=new FinancialTransaction();
		try 
		{
			f.processTransaction("abs", 355464644);
			
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.println("Error processing transacation: Transaction amount must be positive.");
		}
		catch(NumberFormatException e)
		{
			
		}
	}

}
