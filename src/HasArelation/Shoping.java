package HasArelation;

public class Shoping {

	public static void main(String[] args) {
		Order o=new Order("0","Laptop");
		Customer c=new Customer("James","James@example.com",o);
		System.out.println(c);
	}

}
