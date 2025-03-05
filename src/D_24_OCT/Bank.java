package D_24_OCT;

public class Bank {
         private String bankName;
         private String bankCustomer;
         private String bankAddress;
         private String bankIFSCCode;
         private int customerAccountNumber;
         private int currentBalance;
         
         public void setDetails(String bankName,String bankCustomer,String bankAddress,String bankIFSCCode,int customerAccountNumber,int currentBalance) {
        	 this.bankName=bankName;
        	 this.bankCustomer=bankCustomer;
        	 this.bankAddress=bankAddress;
        	 this.bankIFSCCode=bankIFSCCode;
        	 this.customerAccountNumber=customerAccountNumber;
        	 this.currentBalance=currentBalance;
         }
         
         public void withdraw(double amount) {
        	 
        	
        	 if(currentBalance<1000) {
        		 System.out.println("Insufficient Balace!");
        	 }
        	 else {
        		 currentBalance-=amount;
        		 if(currentBalance<1000) {
        			 System.out.println("Maintain minimum Balace!");
        			 currentBalance+=amount;
        			 
        		 }
        		 else {
        		 System.out.println("Trasaction Successful.");
        		 System.out.println(currentBalance);
        		 }
        	 }
         }
         
         public void deposit(double amount) {
        	 currentBalance+=amount;
        	 System.out.println("Deposit Successfull.");
        	 currentBalance();
         }
         public void currentBalance() {
        	 System.out.println("Current Balance :"+currentBalance);
         }
         
		
		public String displayDetails() {
			return "Bank [bankName=" + bankName + ", bankCustomer=" + bankCustomer + ", bankAddress=" + bankAddress
					+ ", bankIFSCCode=" + bankIFSCCode + ", customerAccountNumber=" + customerAccountNumber
					+ ", currentBalance=" + currentBalance + "]";
		}
}
