package inheritance;

public class TicketMain {

	public static void main(String[] args) {

		  Ticket t=new Ticket("concert",101,5000.5);
		  System.out.println("Regula Price:");
          t.displayd();
          System.out.println();
          VIPTicket v=new VIPTicket("VIP concert", 201,100, "BackStage Access");
          System.out.println("VIP Ticket:");
          v.displayd();
          System.out.println();
          StudentTicket s=new StudentTicket("Student event", 301, 30, true);
          System.out.println("Student Price:");
          s.display();
          
	}

}
