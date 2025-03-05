package Interface;

public class EmployeeManagentSystem {

	public static void main(String[] args) {
		
       Employee e=new FullTimeEmployee(111,"suraj",50000.0,5000.0);
      
       e.generagePayroll();
       System.out.println(e.calculateSalary());
	}

}
