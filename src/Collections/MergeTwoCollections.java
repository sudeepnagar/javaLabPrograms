package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class MergeTwoCollections {

	public static void main(String[] args) {
		Collection<String> list =new ArrayList<String>();
		list.add("Mango");
		list.add("Banana");
		list.add("Pineapple");
		
		Collection<String> list2 =new ArrayList<String>();
		list2.add("Mango");
		list2.add("Banana");
		list2.add("Pineapple");
		list.addAll(list2);
		System.out.println(list);
	}

}
