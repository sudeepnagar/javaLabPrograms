package D_22_OCT;
import  java.util.*;

public class Employee_ELC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter emp name:");
   	  String n=sc.nextLine();
   	  System.out.println("enter emp id:");
   	  int id=sc.nextInt();
      System.out.println("enter emp salary:");
   	  double s=sc.nextDouble();
   	  
   	  Employee_BLC e=new Employee_BLC();
   	  
   	  e.setEmployeeData(id, n, s);
   	  e.getEmployeeData();
   	  
   	  System.out.println("========================");
   	  Employee_BLC b=new Employee_BLC();
   	  b.setEmployeeData(65,"vivek", 556565);
   	  b.getEmployeeData();
   	  sc.close();
	}

}
