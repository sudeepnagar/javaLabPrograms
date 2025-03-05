package D_23_OCT;

public class Employee_BLC {
           private String firstName;
           private String lastName;
           private int employeeId;
           private double salary;
           private int noOfProject;
           
	  public void setEmployeeData(String firstName,String lastName,int employeeId,double salary,int noOfProject){
		  this.firstName=firstName;
		  this.lastName=lastName;
		  this.employeeId=employeeId;
		  this.salary=salary;
		  this.noOfProject=noOfProject;
	  }
	  
	  public void calculateSalary() {
		  if(noOfProject>=5&&noOfProject<10) {
			  salary+=5000;
		  }
		  else if(noOfProject>=10&&noOfProject<20) {
			  salary+=10000;
		  }
		  else if(noOfProject>=20) {
			  salary+=15000;
		  }
	  }
	  
	  public void displayDetails() {
		  System.out.println("First Name of emp is: "+ firstName);
		  System.out.println("Last Name of emp is: "+ lastName);
		  System.out.println("Id of emp is: "+ employeeId);
		  System.out.println("Salary of employee is: "+salary);
	  }
}
