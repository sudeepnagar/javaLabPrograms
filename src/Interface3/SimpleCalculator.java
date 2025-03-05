package Interface3;

public class SimpleCalculator implements Calculator {
  
	@Override
	public void calculateSum(double ...x) {
		double sum=0;
      for(double a: x) {
    	  sum=sum+a;
      }
      System.out.println("sum= "+ sum);
	}

}
