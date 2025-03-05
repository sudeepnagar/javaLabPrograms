package D_29_NOV;

class ShapeCalculator {
         public int calculateArea(int sideLength){ 
        	 if(sideLength<0) {
        		 System.err.println("side length must be positive");
                  System.exit(0);
        	 }
        	 return sideLength*sideLength;
        	 
         }
         
     
		public int calculateArea(int length, int width) {
			if(length<0 || width<0) {
				System.err.println("length and width must be positive");
				System.exit(0);
			}
        	 return length*width;
         }
         public double calculateArea(double radius) {
        	 return 3.14*radius*radius;
         }  
}


