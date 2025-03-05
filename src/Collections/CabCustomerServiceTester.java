package Collections;

import java.util.ArrayList;

class CabCustomer {
	private int custId;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	private String phone;

	public CabCustomer() {
		super();
		this.custId = this.getCustId();
		this.customerName = this.getCustomerName();
		this.pickupLocation = this.getPickupLocation();
		this.dropLocation = this.getDropLocation();
		this.distance = this.getDistance();
		this.phone = this.getPhone();
	}

	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
			String phone) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

class CabCustomerService {
	private ArrayList<CabCustomer> list = new ArrayList<CabCustomer>();

	public void addCabCustomer(CabCustomer c) {
//		if (isFirstCustomer(c) == true) {
//			System.out.println("Customer already added!");
//		}	
		list.add(c);
	}

	public boolean isFirstCustomer(CabCustomer c) {
		for (CabCustomer d : list) {
			if (d.getPhone().equals(c.getPhone())) {
				return false;
			}
		}
        list.add(c);
		return true;
	}

	public int calculateBill(CabCustomer c) {
		if (isFirstCustomer(c) == true) {
			return 0;
		} else if (c.getDistance() <= 4) {
			return 80;
		} else {
			return 80 + (c.getDistance() - 4) * 6;
		}
	}

	public String printBill(CabCustomer c) {
//		for(CabCustomer d :list) {
		return c.getCustomerName() + "Please pay your bill of Rs." + calculateBill(c);
	}

}

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		CabCustomer c = new CabCustomer(1, "John", "hyderabad", "Bhopal", 4, "20777");
		CabCustomer c1 = new CabCustomer(1, "John", "hyderabad", "Bhopal", 78, "20777");
		CabCustomer c2 = new CabCustomer(1, "John", "hyderabad", "Bhopal", 78, "277");
		CabCustomer c3= new CabCustomer(1, "John", "hyderabad", "Bhopal", 78, "277");
		CabCustomerService cs = new CabCustomerService();
		System.out.println(cs.printBill(c));
		System.out.println(cs.printBill(c1));
		System.out.println(cs.printBill(c2));
		System.out.println(cs.printBill(c3));

	}

}
