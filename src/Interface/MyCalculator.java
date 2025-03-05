package Interface;

class MyCalculator implements AdvancedArithmetic {
        
	int s=0;
	@Override
	public int divisorSum(int a) {
		if(a<=0) {
			System.err.println("Input must be a positive integer.");
			System.exit(0);
		}
		else{
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				 s+=i;
			}
		}
		}
		return s;
	}

}
