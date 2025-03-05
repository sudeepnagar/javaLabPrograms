package D_29_OCT;

public class Employee {
       private String firstName;
       private String lastName;
       private int employeeId;
       private double salary;
       private int NoOfProject;
       
	   public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.NoOfProject = noOfProject;
	}
	   
	   public void calculateSalary() {
		   if(this.NoOfProject<0) {
			   System.err.println("invalid no of projects!");
		   }
		   else if(this.NoOfProject>5&&this.NoOfProject<10) {
			   this.salary+=5000;
		   }
		   else if(this.NoOfProject>10&&this.NoOfProject<20) {
			   this.salary+=10000;
		   }
		   else {
			   this.salary+=15000;
		   }
	   }

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", NoOfProject=" + NoOfProject + "]";
	}
	   
	   
       
       
}
