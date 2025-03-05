package inheritance;

 class Students {
   
		int studentId;
           String name;
           double examFee;
           
          String displayDetails() {
        	  return "Students [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
          }
          double payFee(double amount) {
        	  return 500.5;
          }
		public Students(int studentId, String name, double examFee) {
			super();
			this.studentId = studentId;
			this.name = name;
			this.examFee = examFee;
		}
		
        @Override
	public String toString() {
		return "Students [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
          
}

class DayScholar extends Student{
	double transportFee;

	public DayScholar(double transportFee) {
		super();
		this.transportFee = transportFee;
	}
	
}

class Hosteller extends Students{
	double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}
	
}
