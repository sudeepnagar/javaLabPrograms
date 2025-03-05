package D_02_DEC;

public class MainPayRoll {

	public static void main(String[] args) {
          Employee e= new Employee(111, "vivek", 5000.0, 300.0, 200.0);
          TaxUtil t=new TaxUtil();
          System.out.println(t.calculateTax(e.calculateGrossSalary()));
          
          
	}

}
