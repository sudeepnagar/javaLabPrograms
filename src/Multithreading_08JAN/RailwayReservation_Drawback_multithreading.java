package Multithreading_08JAN;

class Demo implements Runnable{
	int availableSeat=1;
	int wantedSeat;

	public Demo(int wantedSeat) {
		super();
		this.wantedSeat = wantedSeat;
	}

	@Override
	public void run() {
		
		if(availableSeat>=wantedSeat) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("congratulations!");
		availableSeat-=wantedSeat;
		}
		else {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Sorry! not available!");
		}
		
	}
	
}

public class RailwayReservation_Drawback_multithreading {

	public static void main(String[] args) throws InterruptedException {
		Demo d=new Demo(1);
		Thread t1=new Thread(d,"Vivek");
		Thread t2=new Thread(d,"Sudeep");
		
		
		t1.start();
		//t1.join();
		t2.start();
	}

}
