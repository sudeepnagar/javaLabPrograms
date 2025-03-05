package Predefined_Functional_ineterfaces;
import java.util.function.*;
import java.util.*;
public class NumberTester {

	public static void main(String[] args) {
                 
		Predicate<Integer> isEven= num->num%2==0;
		
		Predicate<Integer> isPrime=num->
		{   int c=0;
			for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			   }
			}
			if(c==2) {
				return true;
			}
			else {
				return false;
			}
		};
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=sc.nextInt();
		System.out.println("is "+n+" even? "+isEven.test(n));
		System.out.println("is "+n+" prime? "+isPrime.test(n));
		sc.close();
		
	}

}
