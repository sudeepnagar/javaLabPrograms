package Collections_12Feb;

import java.util.TreeSet;

public class BookSorted {

	public static void main(String[] args) {
		TreeSet<Book> b=new TreeSet<Book>();
		b.add(new Book("lagaan","soumy"));
		b.add(new Book("Dukaan","vivek"));
		b.add(new Book("Mukaam","suraj"));
		b.forEach(System.out::println);
	}

}
