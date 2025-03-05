package test_28DEC;

@FunctionalInterface
interface BooleanOperation{
	public boolean perform(int a, int b) ;
}
@FunctionalInterface
interface DoubleFunction{
	public double calculate(double x, double y) ;
}

public class ThirdMain {

	public static void main(String[] args) {
		BooleanOperation b=new BooleanOperation(){

			@Override
			public boolean perform(int a, int b) {
				if(a%3==0&&b%5==0&&(a+b)%2==0) {
					return true;
				}
				else {
					return false;
				}
			}
			
		};
		
		DoubleFunction d=new DoubleFunction() {

			@Override
			public double calculate(double x, double y) {
				if(x>0&&y<0&&x%2==0) {
					if(y>0) {
					return (x*x*x)/y;
					}
					else {
						return 1;
					}
				}
				else if(x<0&&y<0&&x%2==0) {
					return x*x*y*y;
				}
				else {
					return x+y;
				}
			}
			
		};
		 System.out.println(b.perform(6, 10));
		 System.out.println(d.calculate(5.0, 6.0));
//		BooleanOperation bo= (a,b)->{
//			if(a%3==0&&b%5==0&&(a+b)%2==0) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		};
//		DoubleFunction d= (x,y)->{
//			if(x>0&&y<0&&x%2==0) {
//				if(y>0) {
//				return (x*x*x)/y;
//				}
//				else {
//					return 1;
//				}
//			}
//			else if(x<0&&y<0&&x%2==0) {
//				return x*x*y*y;
//			}
//			else {
//				return x+y;
//			}
//		};
//		
//	 System.out.println(bo.perform(6, 10));
//	 System.out.println(d.calculate(5.0, 6.0));

	}

}
