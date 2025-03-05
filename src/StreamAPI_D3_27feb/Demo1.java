package StreamAPI_D3_27feb;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
          List<String> list=new ArrayList<String>();
          list.add("Sudeep");
          list.add("Suraj");
          list.add("Saumy");
          list.add("Aniket");
          list.add("Indrajeet");
          
          list.stream().filter(str->str.length()>5&&(str.charAt(0)=='A'||str.charAt(0)=='E'
        		  ||str.charAt(0)=='I'||str.charAt(0)=='O'||str.charAt(0)=='U')).forEach(System.out::println);
	}

}
