package StreamAPI_D3_27feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		 list.add("Sudeep Nagar");
        list.add("Suraj Dhakad");
        list.add("Saumy Sahu");
        list.add("Aniket Rajput");
        list.add("Vivel Lodhi");
        
        System.out.println(list);
        Set<String> collect = list.stream().flatMap(lists->Arrays.stream(lists.toLowerCase().split("\\W+")))
        .collect(Collectors.toSet());
        System.out.println(collect);
        
	}

}
