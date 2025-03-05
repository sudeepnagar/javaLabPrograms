package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter a value:");
			 a=sc.nextInt();
			 System.out.println("enter a value:");
			 b=sc.nextInt();
			System.out.println(a);
			System.out.println(b);
		} catch (InputMismatchException e) {
		    System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("not a integer!");
			System.out.println(e.toString());
			
		}
		System.out.println("main method ended");
		sc.close();
	}

}
