package D_28_nov;

class Employee {
    
	   private int empId;
       private String empName;
       private Address address;//Has-A-relation
       
       public Employee(int e, String en,Address a) {
    	   this.empId=e;
    	   this.empName=en;
    	   this.address=a;
       }
       
       
       @Override
   	public String toString() {
   		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
   	}

}
