package collection_framework;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class Iterator_Demo 
{
  public static void main(String[] args) 
  {
	List l = new ArrayList();
	l.add(10);
	l.add("deepak");
	l.add("rahul");
	System.out.println(l);
	
	//in the Iterator only three main method which is hasNext() , next(), remove() shown in below  :-
	
	//Iterator method 
	Iterator itr = l.iterator();
	//hasNext and next method apply here
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	//remove method
	l.remove("rahul");
	System.out.println(l);
  }
}
