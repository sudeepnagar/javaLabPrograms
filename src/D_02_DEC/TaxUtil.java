package D_02_DEC;

class TaxUtil {
         public double calculateTax(double Em) {
        	 if(Em>30000) {
        		 return Em*0.2;
        	 }
        	 else {
        		 return Em*0.05;
        	 }
         }
}
