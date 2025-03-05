package inheritance;

class Ticket {
         private String eventName;
         private int seatNumber;
         private double price;
		public Ticket(String eventName, int seatNumber, double price) {
			super();
			this.eventName = eventName;
			this.seatNumber = seatNumber;
			this.price = price;
		}
		public String getEventName() {
			return eventName;
		}
		public void setEventName(String eventName) {
			this.eventName = eventName;
		}
		public int getSeatNumber() {
			return seatNumber;
		}
		public void setSeatNumber(int seatNumber) {
			this.seatNumber = seatNumber;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
         
		void displayd() {
			System.out.println("event name:"+eventName);
			System.out.println("Seat number:"+seatNumber);
			System.out.println("price:"+price);
			


		}
         
}

class VIPTicket extends Ticket{
	private String specialAccess;

	public VIPTicket(String eventName, int seatNumber, double price, String specialAccess) {
		super(eventName, seatNumber, price);
		this.specialAccess = specialAccess;
	}

	public String getSpecialAccess() {
		return specialAccess;
	}

	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}

	@Override
	void displayd() {
		
		super.displayd();
		System.out.println("Special Access:"+specialAccess);
		

	}
	
	
}

class StudentTicket extends Ticket{

	private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}

	void display() {
		super.displayd();
		System.out.println("Student Discount:"+studentDiscount);
	}
	
	
}
