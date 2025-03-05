package Interface2;

public interface SIMCardInterface {
           String getPhoneNumber();
           String networkProvider();
           void activate();
           void deactivate();
           
}
class Jio implements SIMCardInterface {
         private String phoneNumber;
         private boolean isActive;
         
         public Jio(String phoneNumber) {
        	 this.phoneNumber=phoneNumber;
        	 this.isActive=false;
         }
	@Override
	public String getPhoneNumber() {
	     return phoneNumber;
	}

	@Override
	public String networkProvider() {
		return "Jio";
	}

	 @Override
	    public void activate() {
	        isActive = true;
	        System.out.println("Jio SIM with number " + phoneNumber + " activated.");
	    }

	    @Override
	    public void deactivate() {
	        isActive = false;
	        System.out.println("Jio SIM with number " + phoneNumber + " deactivated.");
	    }
	
}
class Airtel implements SIMCardInterface {
    private String phoneNumber;
    private boolean isActive;
    
    public Airtel(String phoneNumber) {
   	 this.phoneNumber=phoneNumber;
   	 this.isActive=false;
    }
@Override
public String getPhoneNumber() {
    return phoneNumber;
}

@Override
public String networkProvider() {
	return "Airtel";
}

@Override
public void activate() {
    isActive = true;
    System.out.println("Airtel SIM with number " + phoneNumber + " activated.");
}

@Override
public void deactivate() {
    isActive = false;
    System.out.println("Airtel SIM with number " + phoneNumber + " deactivated.");
}
	
}
class BSNL implements SIMCardInterface {
    private String phoneNumber;
    private boolean isActive;
    
    public BSNL(String phoneNumber) {
   	 this.phoneNumber=phoneNumber;
   	 this.isActive=false;
    }
@Override
public String getPhoneNumber() {
    return phoneNumber;
}

@Override
public String networkProvider() {
	return "BSNL";
}

@Override
public void activate() {
    isActive = true;
    System.out.println("BSNL SIM with number " + phoneNumber + " activated.");
}

@Override
public void deactivate() {
    isActive = false;
    System.out.println("BSNL SIM with number " + phoneNumber + " deactivated.");
}
}

interface MobilePhoneInterface{
	 void insert(SIMCardInterface simCard);
	 void remove();
	 void makeCalls(String number);
	 void sendTextMessage(String number, String message);
}

class MobilePhone implements MobilePhoneInterface{
      private SIMCardInterface simCard;
      
      public MobilePhone() {
    	  this.simCard=null;
      }
	@Override
	public void insert(SIMCardInterface simCard) {
		this.simCard=simCard;
		System.out.println("Inserted "+ simCard.networkProvider()+" SIM with number"+ simCard.getPhoneNumber());
		simCard.activate();
	}

	@Override
	public void remove() {
		
		if(simCard!=null) {
			System.out.println("Removing SIM card from "+ simCard.networkProvider());
			simCard.deactivate();
			simCard=null;
			
		}
	}

	@Override
	public void makeCalls(String number) {
		if(simCard!=null && simCard instanceof SIMCardInterface) {
			System.out.println("Making a call to "+ number +" from "+ simCard.networkProvider()+" SIM.");
		}
		else {
			System.out.println("No active SIM card to make a call.");
		}
	}

	@Override
	public void sendTextMessage(String number ,String message) {
		 if (simCard != null && simCard instanceof SIMCardInterface) {
	            System.out.println("Sending text to " + number + ": " + message + " from " + simCard.networkProvider() + " SIM.");
	        } else {
	            System.out.println("No active SIM card to send a text.");
	        }
		
	}
	
}
