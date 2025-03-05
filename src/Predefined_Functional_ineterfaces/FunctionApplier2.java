package Predefined_Functional_ineterfaces;

import java.util.function.*;
import java.util.*;
public class FunctionApplier2 {
        
	    public static int applyFunction(int value, Function<Integer, Integer> func) {
	    	return func.apply(value);
	    }
	public static void main(String[] args) {
	
             Function<Integer,Integer> add=num-> num+5;
             Function<Integer,Integer> mul=num-> num*2;
             Function<Integer,Integer> sub=num-> num-3;
             
             Scanner sc=new Scanner(System.in);
     		System.out.print("Enter a number:");
     		int num=sc.nextInt();
     		
     		System.out.println("Original value:"+num);
     		System.out.println("After adding 5:"+applyFunction(num,add));
     		System.out.println("After multiplying 2:"+applyFunction(num, mul));
     		System.out.println("After substracting 5:"+applyFunction(num,sub));
     		
     		sc.close();
	}

}
