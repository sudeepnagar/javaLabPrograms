package Exception_handling_03JAN;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		BankAccount b=new BankAccount(64100712,1000);
		Customer c=new Customer("Sudeep",b);
		 BankAccount b2=new BankAccount(122025,2000);
	     Customer c2=new Customer("Sourabh",b);
		//System.out.println(c.getName());
		// BankAccount ba=c.getAccount();
		//  System.out.println( ba.getBalance());
		
		Scanner sc=new Scanner(System.in);
		try (sc)
		{
			System.out.println("Select an option");
			System.out.println("  1. Deposit\r\n"
					+ "           2. Withdraw\r\n"
					+ "           3. Transfer\r\n"
					+ "           4. Loan Application\r\n"
					+ "           5. Check Balance\r\n"
					+ "           6. Exit");
			System.out.println("Enter your option");
			int choice=sc.nextInt();
			switch (choice) 
			{
			case 1: 
			{
			  //System.out.println( b.getBalance());
			  System.out.println("How much amount want to deposite?");
			  int amt=sc.nextInt();
			  b.deposit(amt);
			  System.out.println("amount deposited successfully");
			  System.out.println( "updated Balance:"+b.getBalance());
			}break;
			case 2:
			{
				 System.out.println("How much amount want to withdraw?");
				  int amt=sc.nextInt();
				  b.withdraw(amt);
				  System.out.println("amount withdrawl successfully");
				  System.out.println( "updated Balance:"+b.getBalance());
			}break;
			case 3:
			{
				 System.out.println("in which account want to transfer? ");
				 System.out.println("Enter account number:");
				 long ac=sc.nextLong();
			     System.out.println("How much amount want to transfer?");
				  int amt=sc.nextInt();
				  b.transfer(b2, amt);
				  System.out.println("amount transfered successfully");
				  System.out.println( "your updated Balance:"+b.getBalance());
				  System.out.println("his updated balance:"+b2.getBalance());
			}break;
			case 4:
			{
				 System.out.println("Enter Loan amount");
				  int amt=sc.nextInt();
				  b.applyForLoan(amt);;
				  System.out.println("amount granted successfully");
				  System.out.println( "updated Balance:"+b.getBalance());
			}break;
			case 5:
			{
				System.out.println(b.getBalance());
			}break;
			case 6:
			{
				System.exit(0);
			}break;
			default:
				throw new IllegalArgumentException("Unexpected value: " +choice);
			}
		} 
		catch (InsufficientFundsException e) 
		{
			System.out.println(e.toString());
		}
		catch (InvalidAmountException e) 
		{
			System.out.println(e.toString());
		}
		catch (AccountNotFoundException e) 
		{
			System.out.println(e.toString());
		}
		catch (LoanNotAllowedException e) 
		{
			System.out.println(e.toString());
		}
		catch (IllegalArgumentException e) 
		{
			System.out.println(e.toString());
		}

	}

}
