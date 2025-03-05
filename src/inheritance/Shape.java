package inheritance;

public class Shape {
         String color;

		public Shape(String color) {
			super();
			this.color = color;
		}
         
		void displayColor() {
			System.out.println("color="+color);
		}
         
}
class Circle extends Shape{
	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	double area() {
		return 3.14*radius*radius;
		
	}
	
}
