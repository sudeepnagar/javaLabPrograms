package Program;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int d=TwoDigitsDifference.getDiffOfDigits(n);
        System.out.println(d);
        sc.close();
        
	}

}
