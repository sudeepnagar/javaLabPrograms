package Collections_21Feb_PrioprityQueue;

import java.util.*;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		PriorityQueue<String> colors=new PriorityQueue<String>();
		colors.offer("Red");
		colors.add("Green");
		colors.offer("Orange");
		colors.offer("White");
		colors.offer("Black");
		
		System.out.println(colors);
	}

}
