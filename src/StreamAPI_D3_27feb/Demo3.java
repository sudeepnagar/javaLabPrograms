package StreamAPI_D3_27feb;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		 list.add("Sudeep");
         list.add("Suraj");
         list.add("Saumy");
         list.add("Aniket");
         list.add("Indrajeet");
         
         //sort by length
         list.stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
         
         System.out.println("===================================");
         
         //lexographically
         list.stream().sorted((s1,s2)->s1.compareTo(s2)).forEach(System.out::println);
	}

}
