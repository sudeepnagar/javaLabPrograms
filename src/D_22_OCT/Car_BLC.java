package D_22_OCT;

public class Car_BLC {
           String carName;
           double carPrice;
           String carColor;
           String carCompany;
           
           public void setCarData(String n,double p,String c,String co) {
        	 carName=n;
        	 carPrice=p;
        	 carColor=c;
        	 carCompany=co;
           }
           
           public void getCarInformation() {
        	   System.out.println("Name of the car is: "+carName);
        	   System.out.println("Price of the car is: "+carPrice);
        	   System.out.println("Color of the car is: "+carColor);
        	   System.out.println("Company of the car is: "+carCompany);
           }
}
