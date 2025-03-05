package Abstraction;

abstract class Food {
       double proteins;
       double fats;
       double carbs;
       double tastyScore;
       
       
       public Food(double proteins, double fats, double carbs) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		
	}


	public abstract void getMacroNutrients();
       
}
