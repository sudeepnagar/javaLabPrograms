package D_22_OCT;
//BLC
public class Product {
        int productId;
        String productName;
        double productPrice;
        
       public void setProductData(int id,String name,double price){
        	productId=id;
        	productName=name;
        	productPrice=price;
        }
       
       public void getProductInfo() {
    	   System.out.println("Product id is:"+productId);
    	   System.out.println("Product Name is:"+productName);
    	   System.out.println("Product Price is:"+productPrice);
       }
}
