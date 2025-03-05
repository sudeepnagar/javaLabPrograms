package Abstraction;
import java.util.*;
public class TestingFood {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of foods");
	    int n=sc.nextInt(); 
	    
	    System.out.println("enter name:");
	    String name=sc.next();
	    
	    System.out.println("enter macros:");
	    double p=sc.nextDouble();
	    double f=sc.nextDouble();
	    double c=sc.nextDouble();
	     
	    
	    if(name.equals("Bread")) {
	    	System.out.println("bread details:");
			Bread b=new Bread(p,f,c);
			b.getMacroNutrients();
	    }
	    else if(name.equals("Egg")) {
	    	System.out.println("Egg details");
			Egg e=new Egg(p,f,c);
			e.getMacroNutrients();
			
	    }
	    else {
	    	System.err.println("This food is not available!");
	    }
		sc.close();
		
	}

}
