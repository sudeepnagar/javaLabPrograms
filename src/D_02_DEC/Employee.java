package D_02_DEC;

class Employee {
           int id;
           String name;
           double basicSalary;
           double HRAPer;
           double DAPer;
           
		public Employee(int id, String name, double basicSalary, double hRAPer, double dAPer) {
			super();
			this.id = id;
			this.name = name;
			this.basicSalary = basicSalary;
			this.HRAPer = hRAPer;
			this.DAPer = dAPer;
		}
		
		public double calculateGrossSalary() {
			return this.basicSalary+this.HRAPer+this.DAPer;
		}
                
}

