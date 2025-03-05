package D_24_OCT;
import java.util.*;
public class BankDemo {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Bank Name:");
       String bn=sc.nextLine();
       System.out.println("Enter Your Name:");
       String n=sc.nextLine();
       System.out.println("Enter  Address:");
       String a=sc.nextLine();
       System.out.println("Enter IFSC Code:");
       String i=sc.nextLine();
       System.out.println("Enter Account number:");
       int ac=sc.nextInt();
       System.out.println("Enter minimum 1000:");
       int ba=sc.nextInt();
       
       
       Bank b=new Bank();
       b.setDetails(bn, n, a, i, ac, ba);
       b.withdraw(200);
       b.deposit(500);
       b.currentBalance();
       System.out.println(b.displayDetails());
 
       sc.close();
	}

}
