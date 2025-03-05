package Predefined_Functional_ineterfaces;
import java.util.function.*;
public class FunctionApplier {

	public static void main(String[] args) {
		  
		Function<String, Integer> getStringLength=str->str.length();
		Function<Integer, Double> divideAndFormat=n->n/2.0;
		
		System.out.println(getStringLength.apply(""));
		System.out.println(divideAndFormat.apply(8));

	}

}
