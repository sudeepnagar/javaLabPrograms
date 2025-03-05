package D_01_NOV;

public class Customer {
	private String name;
	private int id;
	public Customer(String name , int id)
	{
	this.name=name;
	this.id=id;
	}
	public void setId(int id) //setter 
	{
	this.id=id;
	}
	public int getId() //getter
	{
	return id;
	}
}
