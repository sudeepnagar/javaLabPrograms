package Collections;

import java.util.ArrayList;

class Activity{
	private String name;
	private String schedule;
	
	public Activity(String name, String schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}


	@Override
	public String toString() {
		return "Activity [name=" + name + ", schedule=" + schedule + "]";
	}

	
}

class Destination{
	String name;
	ArrayList<Activity> list =new ArrayList<Activity>();
	public Destination(String name, ArrayList<Activity> list) {
		super();
		this.name = name;
		this.list = list;
	}
	
}

public class TravelItineraryPlanner {

	public static void main(String[] args) {
		

	}

}
