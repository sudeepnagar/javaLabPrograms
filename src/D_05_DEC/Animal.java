package D_05_DEC;

class Animal {
		private String species;
		
         public Animal(String species) {
			super();
			this.species = species;
		}

		public String getSpecies() {
        	 return species;
         }
         
         public void makeSound() {
        	 System.out.println("Generic animal sound.");
         }
         
         @Override
     	public String toString() {
     		return "Animal [species=" + species + "]";
     	}
         
         public void reproduce() {
        	 System.out.println("Generic reproduction method for all animals.");
         }
}

