package StreamAPI_D3_27feb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Employee(Integer id,String name) {
	
}
public class Demo5 {

	public static void main(String[] args) {
		List<Employee> lists= Arrays.asList(
				new Employee(11,"sudeep"),
				new Employee(22, "suraj")
				);
		
	 //  List<Integer> collect = Stream.of(e).map(d->d.id()).collect(Collectors.toList());
		List<Integer> collect = lists.stream().map(d->d.id()).collect(Collectors.toList());
	
		   
	   System.out.println(collect);
		
	}

}
