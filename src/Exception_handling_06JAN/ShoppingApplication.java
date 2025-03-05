package Exception_handling_06JAN;

public class ShoppingApplication {

	public static void main(String[] args) {
		Product p1=new Product(1,"Watch",1000,5);
		Product p2=new Product(2,"Ghadi",3000,7);
		Product p3=new Product(3,"Clock",2000,10);
		ShoppingCart s=new ShoppingCart(50);
		try
		{    
			s.addToCart(p2, 3);
			s.addToCart(p3, 5);
			s.calculateTotal();
			System.out.println(s.calculateTotal());
		} 
		catch (InsufficientQuantityException e) 
		{
			System.out.println(e.toString());
		}

	}

}
