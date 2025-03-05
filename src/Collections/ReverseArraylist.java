package Collections;

import java.util.ArrayList;

public class ReverseArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		System.out.println(list);
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.addAll(list.reversed());
		list.removeAll(list2);
		list.addAll(list2);
	  // System.out.println(list.reversed());
	   System.out.println(list);
	}

}
