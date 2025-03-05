package D_22_OCT;
import java.util.*;
public class Hostel_ELC {
           public static void main(String [] args) {
        	   Scanner sc=new Scanner(System.in);
        	   String n=sc.nextLine();
        	   String t=sc.nextLine();
        	   int to=sc.nextInt();
        	   int a=sc.nextInt();
        	   
        	   Hostel_BLC h=new Hostel_BLC();
        	   h.setInformation(n, t, to, a);
        	   h.getInformation();
        	   
        	   sc.close();
           }
}
