package D_05_DEC;

class Bird extends Animal{
		boolean canFly;
         
         public Bird(String species, boolean canFly) {
        	 super(species);
        	 this.canFly=canFly;
         }
         
         @Override
	public void makeSound() {
     		System.out.println(getSpecies()+" make sound");
	}

	@Override
	public String toString() {
		return "Bird [species=" + getSpecies() + "]"+" Bird [canFly=" + canFly + "]";
	}

	@Override
	public void reproduce() {
		System.out.println("Birds lay eggs as a means of reproduction.");
	}
	 
    public void buildNest() {
          System.out.println("Birds building nests for their eggs.");
    }
}
