package Predefined_Functional_ineterfaces;

import java.util.Scanner;
import java.util.function.*;

public class ValueModifier2 {

		   public static void modifyValue(int value, Consumer<Integer> consume) {
		    	consume.accept(value);
		    }
		public static void main(String[] args) {
		
	             Consumer<Integer> doubleValue=num-> System.out.println("After Doubling the value:"+num*2);
	             Consumer<Integer> incrementBy=num-> System.out.println("After incrementing the value by 3:"+ (num+3));
	             Consumer<Integer> squareValue=num-> System.out.println("After squaring the value:"+num*num);
	             
	             Scanner sc=new Scanner(System.in);
	     		System.out.print("Enter a number:");
	     		int num=sc.nextInt();
	     		
	     		System.out.println("Original value:"+num);
	     		modifyValue(num,doubleValue);
	     		modifyValue(num,incrementBy);
	     		if(num>0) {
	     		modifyValue(num,squareValue);
	     		}
	     
	     		sc.close();
		

	}

}
