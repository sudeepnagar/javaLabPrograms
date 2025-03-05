package Program;

public class RoundedSum {

	public static int sumOfRoundedValues(int n1,int n2,int n3) {
		// TODO Auto-generated method stub
		int a=(n1%10<5?(n1/10)-1*10:(n1/10)+1*10);
		int b=(n2%10<5?(n2/10)-1*10:(n2/10)+1*10);
		int c=(n3%10<5?(n3/10)-1*10:(n3/10)+1*10);
		return a+b+c;
	}

}
