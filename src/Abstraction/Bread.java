package Abstraction;

class Bread extends Food{
    String type="vegetarian";
	public Bread(double proteins, double fats, double carbs) {
		super(proteins, fats, carbs);
		this.tastyScore=8;
	}
	
	@Override
	public void getMacroNutrients() {
		System.out.println("A slice of bread has "+this.proteins +" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		System.out.println("Taste:"+this.tastyScore);
	}
	

}
