package Interface;
import java.util.*;
class AdvancedArithmeticMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        AdvancedArithmetic a1=new MyCalculator();
        System.out.println(a1.divisorSum(a));
        sc.close();
	}

}
