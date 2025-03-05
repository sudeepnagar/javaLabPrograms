package D_02_DEC;

class Manager {
	 int id;
     String name;
     double basicSalary;
     double HRAPer;
     double DAPer;
     double projectAllowance;
     
	public Manager(int id, String name, double basicSalary, double hRAPer, double dAPer, double projectAllowance) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}
     
     public double calculateGrossSalary() {
    	 return this.basicSalary+this.HRAPer+this.DAPer+this.projectAllowance;
     }
}
