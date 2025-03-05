package D_28_OCT;

public class PoweOfTwoOrNot {
           
	 public static boolean checkNumber(int n ) {
		float s=0;
		 for(float i=n;i>=2;i=i/2) {
			 s=i;
		 }
		 if(s==2) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
}
