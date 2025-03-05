package Exception_handling_31DEC;

public class CommandLineDivision {

	public static void main(String[] args) {
	
		
		try 
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			try 
			{
				int c=a/b;
				System.out.println(c);
			} 
			catch (ArithmeticException e) 
			{
				System.out.println(e.toString());
			}
		} 
		catch (NumberFormatException e) 
		{
			System.out.println(e.toString());
		}
		System.out.println("Division operation completed.");

	}

}
