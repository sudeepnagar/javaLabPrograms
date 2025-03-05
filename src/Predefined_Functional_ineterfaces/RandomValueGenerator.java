package Predefined_Functional_ineterfaces;
import java.util.function.*;
import java.util.*;
public class RandomValueGenerator {

	public static void main(String[] args) {
		Random randomint=new Random();
		
		Supplier<String> stringSupplier=()->{
			int r=randomint.nextInt(100);
			return "NIT"+r;
		};
		Supplier<Integer> integerSupplier=()->{
			int r=randomint.nextInt(10,40);
			return r;
		};
		
		System.out.println(stringSupplier.get());
		System.out.println(integerSupplier.get());

	}

}
