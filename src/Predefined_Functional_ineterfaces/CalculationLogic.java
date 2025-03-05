package Predefined_Functional_ineterfaces;
import java.util.function.*;
import java.util.*;
public class CalculationLogic {

	public static boolean testPredicate(int a, Predicate<Integer> predicate ){
		return predicate.test(a);
	}
	public static void main(String[] args) {
		
		Predicate<Integer> isEven=num-> num%2==0;
        Predicate<Integer> isGreaterThanTen=num-> num>10;
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
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println(num+" is even: "+testPredicate(num,isEven));
		System.out.println(num+" is greater than 10: "+testPredicate(num,isGreaterThanTen));
	    System.out.println(num+" is Prime: "+testPredicate(num,isPrime));
	    
	    sc.close();
	}

}
