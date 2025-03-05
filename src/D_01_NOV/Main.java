package D_01_NOV;

public class Main {
  public static void main(String[] args) {
	CopyCons cs=new CopyCons(106,"Raj");
	CopyCons cs1=new CopyCons(cs);
	System.out.println(cs);
	System.out.println(cs1.toString());
}
}
