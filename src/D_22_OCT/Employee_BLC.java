package D_22_OCT;

public class Employee_BLC {
      int employeeId;
      String employeeName;
      double employeeSalary;
     
      public void setEmployeeData(int id,String n,double s){
    	  employeeId=id;
    	  employeeName=n;
    	  employeeSalary=s;
      }
      
      public void getEmployeeData() {
    	  System.out.println("Id is:"+employeeId);
    	  System.out.println("Name is:"+employeeName);
    	  System.out.println("Salary is:"+employeeSalary);
    	  
      }
}
