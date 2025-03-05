package Exception_Handling_01JAN25;

@SuppressWarnings("serial")
class CarStoppedException extends Exception{
	public CarStoppedException(String str) 
	{
		super(str);
	}
}

@SuppressWarnings("serial")
class CarPunctureException extends Exception{
	public CarPunctureException(String str) {
		super(str);
	}
}

@SuppressWarnings("serial")
class CarHeatException extends Exception{
	public CarHeatException(String str) {
		super(str);
	}
}

@SuppressWarnings("serial")
class CarTest {
	public static void Stop(String str) throws CarStoppedException
	{
		if(str.equals("stop")) {
			throw new CarStoppedException("Car Stopped!");
		}
		else {
			System.out.println("Car is not stall");
		}
	}
	
	public static void puncture(String str) throws CarPunctureException
	{
		if(str.equals("puncture")) {
			throw new CarPunctureException("Car is punctured!");
		}
		else {
			System.out.println("Car is not stall");
		}
	}
	
	public static void heat(int  t) throws CarHeatException
	{
		if(t>50) {
			throw new CarHeatException("Car is heated more than 50 degrees");
		}
		else {
			System.out.println("Car is not stall");
		}
	}
	
		
}



public class CarUserMain {

	public static void main(String[] args) {
		
		try 
		{
			CarTest.Stop("stopp");
			CarTest.puncture("puncturee");
			CarTest.heat(55);
		} 
		catch (CarStoppedException|CarPunctureException|CarHeatException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
