package Exception_handling_31DEC;

class ParentClass{
	public void loadingClass(String str) throws ClassNotFoundException
	{
		try 
		{
			Class.forName(str);
		} 
		catch (RuntimeException e) 
		{
			System.out.println(e.toString());
		}
		
		
	}
}
class ChildClass extends ParentClass{
	@Override
	public void loadingClass(String str) throws IllegalArgumentException, ClassNotFoundException
	{
		if(str=="") {
			throw new IllegalArgumentException("Class name cannot be empty");
		}
		else {
			super.loadingClass(str);
		}
	}
}

public class MultipleExceptionMain {

	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		try 
		{
			c.loadingClass("Exception_handling_31DEC.ParentCla");
			System.out.println("Class loaded Successfully:java.lang.ChildClass");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Error loading class in ChildClass. Converting to unchecked exception.");
			throw new RuntimeException("Exception caught: Unchecked Exception: RuntimeException from ChildClass");
			// System.out.println("Exception caught: Unchecked Exception: RuntimeException from ChildClass");
			
		}
		catch(IllegalArgumentException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
