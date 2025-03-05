package Collections_21Feb_PrioprityQueue;

import java.util.*;
public class PriorityQueueDemo3 {

	public static void main(String[] args) {
		PriorityQueue<String> colors1=new PriorityQueue<String>();
		colors1.offer("White");
		colors1.offer("Black");
		colors1.offer("Red");
		colors1.add("Green");
		
		
		PriorityQueue<String> colors2=new PriorityQueue<String>();
		colors2.offer("Red");
		colors2.offer("Pink");
		colors2.offer("Orange");
		colors2.offer("Black");
		
		System.out.println(colors1);
		System.out.println(colors2);
		
		for (String string : colors1) {
			if(colors2.contains(string))
			{
				System.out.println("yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
