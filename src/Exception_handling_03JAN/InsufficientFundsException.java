package Exception_handling_03JAN;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {
     public InsufficientFundsException(String str) 
     {
    	 super(str);
     }
}
@SuppressWarnings("serial")
class InvalidAmountException extends RuntimeException {
     public InvalidAmountException(String str) 
     {
    	 super(str);
     }
}

@SuppressWarnings("serial")
class AccountNotFoundException extends Exception {
     public AccountNotFoundException(String str) 
     {
    	 super(str);
     }
}
@SuppressWarnings("serial")
class LoanNotAllowedException extends RuntimeException {
     public LoanNotAllowedException(String str) 
     {
    	 super(str);
     }
}