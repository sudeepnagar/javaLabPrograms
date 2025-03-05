package practice;

import java.util.*;
class Fruit    
{
}
class Apple extends Fruit   
{
	@Override
	public String toString()
	{
		return "Apple";
	}
}

class Basket<E>      
{
	private E element;  	
	public void setElement(E element) 
	{
		this.element = element;
	}	

	public E getElement() 
	{
		return this.element;		
	}
}

public class Main
{
	public static void main(String[] args) 
	{
		Basket<Fruit> b = new Basket<>();
		b.setElement(new Apple());

		Apple x = (Apple) b.getElement();	
		System.out.println(x);
      		
	}
}
