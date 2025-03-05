package D_29_OCT;

public class Book {
        public String title;
        public String auther;
        public double price;
		
        public Book(String title, String auther, double price) {
			super();
			this.title = title;
			this.auther = auther;
			this.price = price;
		}
        
        
        public void printDetail() {
                 System.out.println("Title:"+this.title);
                 System.out.println("Auther:"+this.auther);
                 System.out.println("Price:"+this.price);
        }
        
        public void applyDiscount(double discountPercentage) {
        	if(discountPercentage<0) {
        		System.err.println("invalid discount percentage");
        	}
        }
        
}
