package Collections_21Feb_PrioprityQueue;

import java.util.*;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		PriorityQueue<String> colors1=new PriorityQueue<String>();
		colors1.offer("Red");
		colors1.add("Green");
		colors1.offer("Orange");
		
		PriorityQueue<String> colors2=new PriorityQueue<String>();
		colors2.offer("Pink");
		colors2.offer("White");
		colors2.offer("Black");
		
		System.out.println(colors1);
		System.out.println(colors2);
	
		colors1.addAll(colors2);
		System.out.println(colors1);
		
		
	}

}
