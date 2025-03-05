package inheritance;

class Animals {
          
	        private String name;

			public Animals(String name) {
				super();
				this.name = name;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
			
			void display() {
				System.out.println("Name:"+name);			}
	        
}

class Mammal extends Animals{
	private boolean hasFur;

	public Mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		if(hasFur==true) {
			System.out.println("Is furtilizer: Yes");
		}
		else {
			System.out.println("Is furtilizer: No");
		}
		
	}
   
	
	
}

class Dog extends Mammal{
	  private String breed;

	public Dog(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Breed:"+breed);
	}
	  
}

