package HasArelation;

class Car {
     
	private String make;
      private String model;
      private Engine engine;
      
	public Car(String make, String model,Engine engine) {
		super();
		this.make = make;
		this.model = model;
		this.engine=engine;
		//Engine e=new Engine("lksjd");
		//this.engine = engine;
		//this.engine=new Engine("lkj");
	}
	
	 @Override
		public String toString() {
			return "Car [make=" + make + ", model=" + model + ", engine=" + engine + "]";
		}

      
      
}
