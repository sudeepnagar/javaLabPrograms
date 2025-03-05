package Predefined_functional_interface3;

import java.util.function.*;
class ClassRoom1
{
	int chair;
	public void setChair(int c)
	{
		chair=c;
	}

	
	
}
public class ObjectCreationMain  {
	
	public static UnaryOperator<ClassRoom>adjuctChair(ClassRoom1 cla)
	{
		cla.setChair(100);
		UnaryOperator<ClassRoom1>ul=(c)->
				{
					return c;
				};
		return (UnaryOperator<ClassRoom>) ul.apply(cla) ;
		
	}
	
	public static void main(String[] args) {
		
//		ObjectCreator customObject=(id,name)-> new Student(id,name);
//		Student s1=(Student) customObject.create(1, "John Doe");
//		s1.updateName(name->s1.setName("Jane Updated"));
//		System.out.println(s1);
//		

		
	}

}
