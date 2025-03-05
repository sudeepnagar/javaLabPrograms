package HasArelation;

class Car2 {
	private String brand;
    private String model;
    private int year;
    private Driver driver;
    
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver + "]";
	}


	
       
       public Car2(String brand, String model, int year, Driver driver) {
    	   this.brand=brand;
    	   this.model=model;
    	   this.year=year;
    	   this.driver=driver;
       }
       
       public Car2(Car2 c1) {
    	  this.brand=c1.brand; 
    	  this.model=c1.model;
    	  this.year=c1.year;
    	  this.driver=c1.driver;
       }
       
     public String getBrand() {
   		return brand;
   	}

   	public void setBrand(String brand) {
   		this.brand = brand;
   	}

   	public String getModel() {
   		return model;
   	}

   	public void setModel(String model) {
   		this.model = model;
   	}

   	public int getYear() {
   		return year;
   	}

   	public void setYear(int year) {
   		this.year = year;
   	}

   	public Driver getDriver() {
   		return driver;
   	}

   	public void setDriver(Driver driver) {
   		this.driver = driver;
   	}
      
   	
   	public void changeDriver(Driver n) {
   		this.driver=n;
   		
   	}   
   	
      
}

class Driver{
	private String name;
	private int age;
	public Driver(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + "]";
	}
	
}

public class Carr{
	public static void main(String[] args) {
		
		Driver d=new Driver("suraj",22);
		Car2 c=new Car2("Mahendra","thar",2021,d);
		System.out.println("Original car details:");
        System.out.println(c);
         
        System.out.println();
        
        Car2 copy=new Car2(c);
        System.out.println("Copied car details:");
        System.out.println(copy);
        
        System.out.println();
        
        Driver d1=new Driver("vivek",23);
        c.changeDriver(d1);
		System.out.println("Original car details after changing:");
		System.out.println(c);
		
		System.out.println();
		
		System.out.println("Copied Car Details after Changing Driver in Original Car:");
     	System.out.println(copy);
		
	}
}
