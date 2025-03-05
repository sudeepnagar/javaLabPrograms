package D_04_DEC;

class SShape {
         public static SShape randshape() {
             switch((int) (Math.random()*3))
             {
             case 0: return new Circle(); 
             case 1: return new Square(); 
             case 2: return new Triangle(); 
             default: System.out.println("finally return an object for shape class");
             }
			return new SShape();
         }
         
        public void draw() {
     		System.out.println("Shape draw");
     	}
     	public void erase() {
     		System.out.println("Shape erase");
     	}
		
		
		
         
}
class Circle extends SShape{
	 public void draw() {
			System.out.println("Circle draw");
		}
		public void erase() {
			System.out.println("Circle erase");
		}
}
class Triangle extends SShape{
	
	   public void draw() {
			System.out.println("Triagle draw");
		}
	
		public void erase() {
			System.out.println("Triangle erase");
		}
}
class Square extends SShape{
	   public void draw() {
			System.out.println("Square draw");
		}
		public void erase() {
			System.out.println("Square erase");
		}
}

public class Shape{
	public static void main(String[] args) {
		
		SShape r = SShape.randshape();
		if(r instanceof Circle)
		{
			r.draw();
			r.erase();
		}
		else if(r instanceof Square)
		{
			r.draw();
			r.erase();
		}
		else if(r instanceof Triangle)
		{
			r.draw();
			r.erase();
		}
		else
		{
			r.draw();
			r.erase();
		}
	}
}