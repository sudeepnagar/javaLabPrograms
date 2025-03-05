package Collections_12Feb;


import java.util.TreeSet;

public class TreeSet_Demo{

	public static void main(String[] args) {
		TreeSet<Product> pl = new TreeSet<Product>((o1,o2)->o1.pId().compareTo(o2.pId()));
		pl.add(new Product(102, "Dell"));
		pl.add(new Product(101, "Laptop"));
		pl.add(new Product(103, "TV"));
		pl.add(new Product(104, "AC"));
		pl.forEach(System.out::println);
		
	}

	

}
