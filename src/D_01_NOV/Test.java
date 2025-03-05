package D_01_NOV;

public class Test {

	public static void main(String[] args) {
		int val=100;
		Customer c = new Customer("Ravi",2);
		m1(c);
		//GC
		System.out.println(c.getId());
		}
		public static void m1(Customer c)
		{
		c.setId(5);
		c = new Customer("Rahul",7);
		c.setId(9);
		System.out.println(c.getId());
		
	}

}
