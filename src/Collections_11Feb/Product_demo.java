package Collections_11Feb;

import java.util.ArrayList;

class Product implements Comparable<Product>{
	private Integer productNumber;
	private String productName;
	private Double productPrice;
	
	public Product(Integer productNumber, String productName, Double productPrice) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public int compareTo(Product o) {
		return this.productName.compareTo(o.productName);
	}
	
	
}
 
public class Product_demo {

	public static void main(String[] args) {
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"laptop",50000.2));
		list.add(new Product(2,"Camera",25000.0));
		list.add(new Product(3,"Mobile",30000.0));
		list.forEach(System.out::println);
	}

}
