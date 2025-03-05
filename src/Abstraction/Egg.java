package Abstraction;

class Egg extends Food{
    String type="non-vegetarian";
	public Egg(double proteins, double fats, double carbs) {
		super(proteins, fats, carbs);
		this.tastyScore=7;
	}


	@Override
	public void getMacroNutrients() {
		
		System.out.println("An egg has "+this.proteins +" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		System.out.println("Taste:"+this.tastyScore);
	}
         
}
