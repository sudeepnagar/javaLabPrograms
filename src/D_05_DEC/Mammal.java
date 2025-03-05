package D_05_DEC;

class Mammal extends Animal{

	boolean hasFur;

	public Mammal(String species, boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
	}
   
	@Override
	public void makeSound() {
		System.out.println(getSpecies()+" make sound");
	}

    @Override
	public String toString() {
		return "Animal [species=" + getSpecies() + "]"+" Mammal [hasFur=" + hasFur + "]";
	}

		@Override
		public void reproduce() {
		   System.out.println("Mammals give birth to live young.");
		}
       
		public void nurseYoung() {
			System.out.println("Mammals nursing their young");
		}

}
