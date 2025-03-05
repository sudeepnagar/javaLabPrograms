package Exception_handling_06JAN;

@SuppressWarnings("serial")
public class InsufficientQuantityException extends Exception{
         public InsufficientQuantityException(String str) 
         {
        	 super(str);
         }
}
@SuppressWarnings("serial")
class InvalidProductException extends RuntimeException{
         public InvalidProductException(String str) 
         {
        	 super(str);
         }
}
