package D_02_DEC;

class Trainer {
	 int id;
     String name;
     double basicSalary;
     double HRAPer;
     double DAPer;
     int batchCount;
     double perkPerBatch;
     
	public Trainer(int id, String name, double basicSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
     
	public double calculateGrossSalary() {
		return this.basicSalary+this.HRAPer+this.DAPer+(this.batchCount*this.perkPerBatch);
	}
     
}
