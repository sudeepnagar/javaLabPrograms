package Collections_12Feb;

public record Book(String name, String auther) implements Comparable<Book> {

	@Override
	public int compareTo(Book o) {
		
		return this.name.compareTo(o.name);
	}

}
