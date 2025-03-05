package Collections;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	private String name;
	private String position;
	private double salary;
	public Employee(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
}

class Directory{
	ArrayList<Employee> list=new ArrayList<Employee>();
	
	public void addEmployee(Employee e) {
		list.add(e);
	}
	
	public void displayAllEmployees() {
		System.out.println(list);
	}
	
	public void updateAllEmployee(String s,int newSal)
	{
	    	for(Employee e2:list)
	    	{ 
	    			e2.setPosition(s);
	    			e2.setSalary(newSal);
	    	}
	}
	
	public void deleteEmployee(Employee e)
	{
		list.remove(e);
	}
}

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
      Directory d=new Directory();
      Employee e=new Employee("Alice", "Manager",60000.0 );
      Employee e1=new Employee("Bob", "Developer",50000.0 );
      
      d.addEmployee(e);
	   d.addEmployee(e1);
      
    while(true) {
      System.out.println(" 1) Display Employee");
      System.out.println(" 2) Delete Employee");
      System.out.println(" 3) Update Employee");
      System.out.println(" 4) Exit Employee");
      int choice=sc.nextInt();
       switch(choice)
       {
   
       case 1:
    	   d.displayAllEmployees();
    	   break;
    	   
       case 2:
    	   d.deleteEmployee(e);
    	   System.out.println("Employee deleted Successfully.......");
    	   break;
    	   
       case 3:
    	    d.updateAllEmployee("Senior Developer", 55000);
    	    System.out.println("Employee details updated Successfully.......");
    	    break;
     
       case 4: 
    	   
    	    System.out.println("Exited!");
    	    sc.close();
    	    System.exit(0);
         
       }
    }
   
	}

}
