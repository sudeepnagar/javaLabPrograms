package Exception_handling;

import java.util.Scanner;

public class ExceptionHandlingDemoo {
    
	public static void handleExceptions(String s) {
		try {
			int a=Integer.parseInt(s);
			System.out.println("length of String is:"+s.length());
			System.out.println(a);
		} 
		catch (NullPointerException e) {
			System.out.println("Please enter someting!");
			
			System.out.println(e.toString());
		}
		catch (NumberFormatException e) {
			System.out.println("this cannot be converted into number!");
			
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		handleExceptions(s);
		sc.close();

	}

}
