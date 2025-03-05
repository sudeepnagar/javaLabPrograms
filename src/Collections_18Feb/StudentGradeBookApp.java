package Collections_18Feb;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

record Student(String name,String grade,HashMap<String,String> students) {
	
	
	public  boolean alreadyExists(String name,String grade) {
		
		for (Map.Entry<String, String> entry : students.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			if(key.equals(name)&& val.equals(grade))
			{
				return true;
			}
		}
		return false;
	}
}

public class StudentGradeBookApp {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		HashMap<String, String> students=new HashMap<String, String>();
		
		while(true)
		{
		System.out.println("Options:\n"+
		                  "1.Add Student Grade\n"+
				             "2.Remove Student Grade\n"+
		                     "3.Exit");
		System.out.println("Enter your choice:");
	
		int choice=Integer.parseInt(s.nextLine());
		
		switch(choice)
		{
		case 1:
			
			System.out.println("Enter Student name:");
			String name=s.nextLine();
			System.out.println("Enter Grade:");
			String grade=s.nextLine();
			Student so=new Student(name, grade, students);
			if(so.alreadyExists(name, grade)) {
				
				System.err.println("student already exits...");
			}else {
			students.put(name, grade);
			System.out.println("Grade added successfully...");
			System.out.println("========================");
			}
			break;
		case 2:
			if(students.isEmpty()) {
				System.out.println("Grade book is emply....");
			}else {
				System.out.println("Enter student name:");
				String sName=s.nextLine();
				if(students.containsKey(sName)) {
					students.remove(sName);
				}else {
					System.err.println("Student does not exists...");
				}
				
			}
			System.out.println(students);
		    break;
		case 3:
			System.out.println("thank you......");
			System.exit(0);
		    break;
		}
		}
		

	}

}
