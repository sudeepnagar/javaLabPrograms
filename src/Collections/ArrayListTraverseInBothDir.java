package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTraverseInBothDir {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------------");
		
		ListIterator<Integer> li = list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("------------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
