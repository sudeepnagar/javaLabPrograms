package D_29_OCT;

public class EmpDemo {

	public static void main(String[] args) {
		Emp e=new Emp(-5,"hgff",43000);
	    System.out.println(e);
	    
		if(e.employeeSalary>=60000) {
			System.out.println("Employee is a Developer");
		}
		else if(e.employeeSalary>=40000&&e.employeeSalary<60000) {
			System.out.println("Employee is a Designer");
		}
		else {
			System.out.println("Employee is a Tester");
		}
		
	}

}
