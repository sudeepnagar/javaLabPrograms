package Predefined_functional_interface3;

import java.util.Scanner;
import java.util.function.UnaryOperator;

class ClassRoom{
     private int chairs;
     
     public int getChairs() {
    	 return chairs;
     }
     public void setChairs(int chairs) {
    	 this.chairs=chairs;
     }
     @Override
     public String toString() {
    	 return "chairs:"+chairs;
     }
     
     public static UnaryOperator<ClassRoom> adjustChairs(ClassRoom cls){
    	 UnaryOperator<ClassRoom> clsRoom=null;
	 Scanner sc= new Scanner(System.in);
	 System.out.print("Enter the number of students : ");
	 int numOfStudents = Integer.parseInt(sc.nextLine());
	 if(numOfStudents>cls.getChairs()) {
		 int rest=numOfStudents-cls.getChairs();
		
		 cls.setChairs(cls.getChairs()+rest);
		 System.out.println("Updated chairs incresased : "+rest);
		 clsRoom=(clsr)->cls;
		 return clsRoom;
	 }else if(numOfStudents<cls.getChairs()){
		 int rest=cls.getChairs()-numOfStudents;
		 cls.setChairs(cls.getChairs()-rest);
		 System.out.println("Updated chairs decreased : "+rest);
		 clsRoom=(c)->cls;
	 }else {
		 System.out.println("No update");
		 clsRoom=(c)->cls;
	 }
	 return clsRoom;
     }
     
}

public class ClassroomMain {
	public static void main(String[] args) {
		 ClassRoom cl=new ClassRoom();
		 cl.setChairs(100);
		 UnaryOperator<ClassRoom> adjustChairs = ClassRoom.adjustChairs(cl);
		
	}

}
