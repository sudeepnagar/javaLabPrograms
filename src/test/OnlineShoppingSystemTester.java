package test;
class Product {
    protected String name;
    protected double price;

    public Product(String name, double price){
                       this.name=name;
                       this.price=price;
    }

    public void displayInfo(){
        System.out.println("Name="+ this.name);
        System.out.println("Price="+ this.price);
    }
    public int calculateTotalcost(int quantity){
       return (int) (quantity*this.price);
    }
}
class Electronics extends Product{
    private String brand;
     
     public Electronics(String name, double price,String brand){
        super(name,price);
        this.brand=brand;
     }
    
     public void displayInfo(){
         System.out.println("Name="+ name);
        System.out.println("Price="+ price);
       System.out.println("Brand="+ this.brand);
     }
}

class Clothing extends Product{
    private String size;

    public Clothing(String name, double price,String size){
        super(name,price);
        this.size=size;
     }
     
     public void displayInfo(){
         System.out.println("Name="+ name);
        System.out.println("Price="+ price);
       System.out.println("Product size="+ this.size);
     }
}

public class OnlineShoppingSystemTester{
    public static void main(String[] args){
        Electronics e=new Electronics("Watch",5000,"Fastrack");
        e.displayInfo();
        int t=e.calculateTotalcost(2);
        System.out.println("total="+t);
        Clothing c= new Clothing("Jeans",3000,"30");
        c.displayInfo();
        int to=e.calculateTotalcost(3);
        System.out.println("total="+to);

    }
}