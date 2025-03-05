package test_28DEC;

@FunctionalInterface
interface Operation{
	public int perform(int a, int b) ;
}
@FunctionalInterface
interface Greeting{
	public void greeting(String name, int age) ;
}

public class FirstMain {

	public static void main(String[] args) {
		Operation op= (a,b)->{
			if(a>0&&b>0) {
				return (a*a)+(b*b);
			}
			else {
				return a+b;
			}
		};
		Greeting g= (name,age)->{
			if(age>18) {
				System.out.println("Person is adult");
			}
			else if(name.length()>5&&age<18){
				System.out.println("person has a long name and is not an adult yet");
			}
			else {
				System.out.println("thank you!");
			}
		};
		
	 System.out.println(op.perform(5, 0));
	 g.greeting("sudeep", 17);

	}

}

