package Exception_handling_06JAN;



class Foo extends Thread
{
    public void run() 
    {
        for(int i=0;i<3;i++)
        {
	        System.out.println("Run by..."+Thread.currentThread().getName()+",i Is "+ i);
	        System.out.println(Thread.currentThread().getName());
        try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
    }
    public void run(String name)
    {
        System.out.println("This is Second"+name);
    }
}
public class Main extends Thread
{
	
    public static void main(String args []) throws InterruptedException
    {  
    	Foo f = new Foo();
	    Thread t = new Thread(f,"first");
	    Thread t1 = new Thread(f,"second");
	    t1.start();
	    sleep(2000);
	   
    }
}
