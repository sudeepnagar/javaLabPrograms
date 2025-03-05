package D_28_OCT;

public class CalculateDifference {
      

		public static int calculateDifference(int num) {
        
			int sum=0;
			int sum1=0;
		
			    for(int i=1;i<=num;i++) {
			    	 sum=sum+(i*i);
			    	 sum1=sum1+i;
			    }
			    sum1=sum1*sum1;
		      return sum-sum1;
			
		}
		
           
           
}
