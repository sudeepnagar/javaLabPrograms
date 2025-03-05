package Interface2;

public class MobileSIMInteraction {

	public static void main(String[] args) {
		   // Create SIM cards for different providers
        SIMCardInterface jioSim = new Jio("9876543210");
        SIMCardInterface airtelSim = new Airtel("9123456789");
        SIMCardInterface bsnlSim = new BSNL("9012345678");

        // Create a mobile phone instance
        MobilePhone mobilePhone = new MobilePhone();

        // Insert Jio SIM and make calls and send messages
        mobilePhone.insert(jioSim);
        mobilePhone.makeCalls("9876543210");
        mobilePhone.sendTextMessage("9876543210", "Hello from Jio!");
        mobilePhone.remove();
  System.out.println("===========================================");
        // Insert Airtel SIM and make calls and send messages
        mobilePhone.insert(airtelSim);
        mobilePhone.makeCalls("9123456789");
        mobilePhone.sendTextMessage("9123456789", "Hello from Airtel!");
        mobilePhone.remove();
  System.out.println("===========================================");
        // Insert BSNL SIM and make calls and send messages
        mobilePhone.insert(bsnlSim);
        mobilePhone.makeCalls("9012345678");
        mobilePhone.sendTextMessage("9012345678", "Hello from BSNL!");
        mobilePhone.remove();
    }
		
		
}


