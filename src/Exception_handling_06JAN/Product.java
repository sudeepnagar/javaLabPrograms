package Exception_handling_06JAN;

public class Product {
	int id;
	String name;
	double price;
	int quantity;

	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void decreaseQuantity(int amt) throws  InsufficientQuantityException
	{
		if(amt<quantity) {
			throw new InsufficientQuantityException("insufficient!");
		}
		this.quantity-=amt;
	}

}
class ShoppingCart{
	Product cartItems[];
	int itemCount;
	int l=0;
	public ShoppingCart(int capacity)
	{
		cartItems=new Product[capacity];
	}
	
	public void addToCart(Product p,int quantity) throws InsufficientQuantityException,InvalidProductException 
	{
		 
		if(p==null) {
			throw new InvalidProductException("not product!");
		}
	    else if(p.quantity<quantity) {
			throw new InsufficientQuantityException("insufficient!");
		}
	    else {
	    	
	    	l=quantity+l;
	    	for(int i=itemCount;i<l;i++) {
	    		
	    		cartItems[i]=p;
	    		itemCount++;
	    	//	System.out.print(itemCount);
	    	//	System.out.println(i);
	    	}
	    	p.quantity-=quantity;
	    }
	}
	
	public double calculateTotal()
	{
		double d=0;
		for(int i=0;i<itemCount;i++) {
			Product p=cartItems[i];
			d=d+p.price;
			//System.out.println(d);
		}
		return d;
	}
	
}
