package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLIstToArrayList {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		System.out.println(list);
		
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.addAll(list);
		
		System.out.println(list2);

	}

}
