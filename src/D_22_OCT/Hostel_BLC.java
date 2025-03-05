package D_22_OCT;

public class Hostel_BLC {
	           String ownerName;
               String hostelType;
               int totalRooms;
               int availableRooms;
               
               public void setInformation(String n,String t,int r,int a) {
            	   ownerName=n;
            	   hostelType=t;
            	   totalRooms=r;
            	   availableRooms=a;
               }
               
               public void getInformation() {
            	   System.out.println("Hostel owner name is:"+ownerName);
            	   System.out.println("Hostel Type name is:"+hostelType);
            	   System.out.println("Total rooms in hostel:"+totalRooms);
            	   System.out.println("Available rooms in hostel:"+availableRooms);
               }
               
               
}
