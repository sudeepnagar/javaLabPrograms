package Interface;

class FullTimeEmployee implements Employee {
    private int employeeId;
    private String employeeName;
    private double monthlySalary;
    private double benefits;
    
    
    
	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
	}

	@Override
	public double calculateSalary() {
		double tot=0;
		if(monthlySalary<=0) {
			System.err.println("Monthly salary cannot be negative");
		}
		else if(benefits<0) {
			System.err.println("befits must be positive");
		}
		else {
		 tot= monthlySalary+benefits;
		}
		return tot;
	}

	@Override
	public void generagePayroll() {
		System.out.println("Employee id:"+employeeId);
		System.out.println("Employee name:"+employeeName);
		System.out.println("Monthly salary:"+monthlySalary);
		System.out.println("benefits:"+benefits);
	}

}
