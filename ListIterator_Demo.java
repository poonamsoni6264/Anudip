package collection_framework;

import java.util.ListIterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator_Demo 
{
  public static void main(String[] args) 
  {
	    List l = new ArrayList();
		l.add(10);
		l.add("Poonam");
		l.add("Soni");
		System.out.println(l);
		
		//in the ListIterator  Five main method which is hasNext() , next(), hasPrevious(), previous(), remove() , set() shown in below 
		
		//ListIterator method
		ListIterator li = l.listIterator();
		//hasNext and next method apply here
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("-----------------");
		
		//hasPrevious method and previous method
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	
		System.out.println();
		
		//remove method
		l.remove(0);
		System.out.println(l);
		
		System.out.println();
		//set method or it is also called replace method
		l.set(1, "100ni");
		System.out.println(l);
		
  }
}
