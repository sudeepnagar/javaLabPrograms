package D_22_OCT;
import java.util.*;
public class Car_ELC {
          public static void main(String [] args) {
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("Enter car name:");
        	  String n=sc.nextLine();
        	  System.out.println("Enter Price of the car:");
        	  int p=sc.nextInt();
        	  System.out.println("Enter Color of the car:");
        	  sc.nextLine();
        	  String c=sc.nextLine();
        	  System.out.println("Enter Company of the car:");
        	  String co=sc.nextLine();
        	  
        	  Car_BLC car=new Car_BLC();
        	  car.setCarData(n, p, c, co);
        	  car.getCarInformation();
        	  
        	  System.out.println("===========================");
        	  System.out.println("Enter car name:");
        	   n=sc.nextLine();
        	  System.out.println("Enter Price of the car:");
        	   p=sc.nextInt();
        	  System.out.println("Enter Color of the car:");
        	  sc.nextLine();
        	   c=sc.nextLine();
        	  System.out.println("Enter Company of the car:");
        	   co=sc.nextLine();
        	  
        	  Car_BLC car2=new Car_BLC();
        	  car2.setCarData(n, p, c, co);
        	  car2.getCarInformation();
        	  
        	  sc.close();
          }
}
