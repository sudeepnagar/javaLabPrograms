package Exception_handling;

public class IllegalStateException1 {

	 static void throwIllegalException( ) { 
			try{ 
				throw new IllegalStateException("MyException"); 
			} catch(IllegalStateException objA){
				System.out.println("caught:" +objA); 
			}
		    }
	 
	public static void main(String[] args) {
		
		throwIllegalException();

	}

}
