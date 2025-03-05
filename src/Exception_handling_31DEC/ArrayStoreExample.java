package Exception_handling_31DEC;

import java.util.Scanner;

public class ArrayStoreExample {
	
	public static void storeObjects() throws ArrayStoreException
	{
		Object st[] = new Object[4];
	
		st[0]="sudeep";
		st[1]="sudeep";
		st[2]="sudeep";
		st[3]=123;
		
		
		for(Object o:st) {
			   if(o instanceof String) {
				//String str=(String) o;
				//System.out.println(str);
				   System.out.println(o);
			   }
			   else {
				throw new ArrayStoreException();
			   }
		}
	
	}

	public static void main(String[] args) {
		
     try 
     {
    	 storeObjects();
	 } 
     catch (ArrayStoreException e) 
     {
	    System.out.println("ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String\r\n");
		
	 }
		
	}

}
