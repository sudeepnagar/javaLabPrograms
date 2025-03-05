package StreamAPI_D3_27feb;

import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		int s[]= {1};
		Stream.generate(()->s[0]++).map(n->n*n).filter(n->n%2==1).limit(10).forEach(System.out::println);
		
		//int a= 1;
		Stream.iterate(1, num->num+1).map(n->n*n).filter(n->n%2==1).limit(10).forEach(System.out::println);

	}

}
