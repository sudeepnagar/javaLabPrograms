package D_29_OCT;

public class Emp {
           public int employeeNumber;
           public String employeeName;
           public double employeeSalary;
		
           public Emp(int employeeNumber, String employeeName, double employeeSalary) {
			super();
		
			this.employeeNumber = employeeNumber;
			if(this.employeeNumber<0) {
				this.employeeNumber=0;
				System.err.println("empNo must be always positive integer");
			   System.exit(0);
			}
			
			this.employeeName = employeeName;
			if(this.employeeName==null) {
				this.employeeName="";
				System.err.println("empName must be initialized with any default name");
				System.exit(0);
			}
			
			this.employeeSalary = employeeSalary;
			if(this.employeeSalary<0) {
				this.employeeSalary=0.0;
				System.err.println("empSal cannot be negative");
				System.exit(0);
			}
		}

		@Override
		public String toString() {
			return "Emp [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + "]";
		}
           
        
           
           
           
}
