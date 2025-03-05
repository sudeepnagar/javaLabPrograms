package Collections;

import java.util.ArrayList;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		System.out.println(list);
		list.remove(1);//list
		System.out.println(list);
		//list.remove(new Integer(20));//collection
		list.remove(Integer.valueOf(15));//collection
		System.out.println(list);
		
		

	}

}
