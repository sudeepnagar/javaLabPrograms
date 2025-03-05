package Abstraction;

public class Test extends Car{

	

	public static void main(String[] args) {
		
		 Car t=new Test();
		 t.carBrand("Safari");
		 t.carModel("safari stream");
		 t.carMileage(5);
		 t.carTopSpeed(300);
		 t.carYear(2014);
		 t.display();
	}

	@Override
	public void display() {
		
		System.out.println("Car Brand:"+brand);
		System.out.println("Car Model:"+model);
		System.out.println("Car Mileage:"+mileage);
		System.out.println("Car Top Speed:"+top_speed);
		System.out.println("Year of manufacturing:"+yearOfManufacturing);
	}

}
