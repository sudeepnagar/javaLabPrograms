package HasArelation;

class Engine {

	private String model;

	public Engine(String model) {
		super();
		this.model = model;
	}
	
	   public String getModel() {
			return model;
		}
        
	   
		@Override
		public String toString() {
			return "Engine [model=" + model + "]";
		}

}
