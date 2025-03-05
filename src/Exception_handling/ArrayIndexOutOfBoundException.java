package Exception_handling;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		int a[]=new int[2];
		
		
		try {
			a[0]=1;
			a[1]=2;
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
		  System.out.println("An ArrayIndextOutOfBoundsException occured.");
		  System.out.println(e.getMessage());
		  System.out.println(e.toString());
		  e.printStackTrace();
		}
		System.out.println("main method ended!");
	}

}
