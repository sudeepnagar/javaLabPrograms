package D_04_DEC;

class Payment{
	public void processPayment() {
		System.out.println("Processing payment");
	}
}

class CreditCardPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment");
	}
}
class PayPalPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Processing PayPal payment");
	}
}
class BankTransferPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Processing bank transfer payment");
	}
}

public class PaymentMain {

	public static void main(String[] args) {
		Payment pa=new Payment();
		CreditCardPayment c=new CreditCardPayment();
		PayPalPayment pl=new PayPalPayment();
		BankTransferPayment b=new BankTransferPayment();
		PaymentMain.processMultiplePayments(pa,c,pl,b);
      
	}
	public static void processMultiplePayments(Payment ...payments ){
		for(Payment p:payments) {
			p.processPayment();
		}
	}

}
