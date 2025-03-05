package Program;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n= sc.nextInt();
         int ne=NextMultipleOfHundred.getNextMultipleOfHundred(n);
         System.out.println(ne);
         sc.close();
	}

}
