package inheritance;

public class Employee {
        String name;
        double salary;
        
		public Employee(String name, double salary) {
			super();
			this.name = name;
			this.salary = salary;
		}
        
        void work() {
        	System.out.println(name+" is working");
        }
}

class Manager extends Employee{
	String department;

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	void manage() {
		System.out.println(name+" is managing sales Department");
	}
	
}
