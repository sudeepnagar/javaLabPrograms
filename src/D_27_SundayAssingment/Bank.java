package D_27_SundayAssingment;

public class Bank {
           private static String bankName="Union Bank";
           private static String ifscCode="UBIN0540625";
           private String customerName;
           private int accountNumber;
           
           
		public Bank(String customerName, int accountNumber) {
			super();
			this.customerName = customerName;
			this.accountNumber = accountNumber;
		}


		@Override
		public String toString() {
			return "Bank [customerName=" + this.customerName + ", accountNumber=" + this.accountNumber + ", bankName=" + bankName
					+ ", ifscCode=" + ifscCode +"]";
		}
           
           
}
