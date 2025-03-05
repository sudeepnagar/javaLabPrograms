package Predefined_Functional_ineterfaces;
import java.util.function.*;
import java.util.*;
public class ValueModifier {

	public static void main(String[] args) {
		
           Consumer<String> stringConsumer= str->System.out.println(str.toUpperCase());
           Consumer<Integer> integerConsumer=n->System.out.println(n*n);
           
        Scanner sc=new Scanner(System.in);
   		System.out.print("enter a String:");
   		String str=sc.nextLine();
   		System.out.print("enter a number:");
   		int n=sc.nextInt();
   		
   		stringConsumer.accept(str);
   		integerConsumer.accept(n);
   		sc.close();
	}

}
