package Abstraction;

abstract class Car {
       String brand;
       String model;
       int mileage;
       int top_speed;
       int yearOfManufacturing;
	
    
	public String carBrand(String brand) {
		this.brand=brand;
    	 return brand;
     }
	public String carModel(String model) {
		this.model=model;
   	 return model;
    }
	public int carMileage(int mileage) {
		this.mileage=mileage;
   	 return mileage;
    }
	public int carTopSpeed(int top_speed) {
		this.top_speed=top_speed;
   	 return top_speed;
    }
	public int carYear(int yearof) {
		this.yearOfManufacturing=yearof;
   	 return yearOfManufacturing;
    }
       
    public abstract void display();
}
