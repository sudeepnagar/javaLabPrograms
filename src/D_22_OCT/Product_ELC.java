package D_22_OCT;
import  java.util.*;
public class Product_ELC {
           public static void main(String [] args) {
        	  Scanner sc=new Scanner(System.in);
        	  String n=sc.nextLine();
        	  int id=sc.nextInt();
        	  double pr=sc.nextDouble();
        	  Product p=new Product();
        	  p.setProductData(id,n,pr);
        	  p.getProductInfo();
        	  sc.close();
           }
}
