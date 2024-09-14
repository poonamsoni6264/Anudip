package collection_framework;

import java.util.*;

public class Enumeration_Cursor 
{
   public static void main(String[] args) 
   {
	Vector v = new Vector();
	v.add(120);
	v.add(300);
	v.add("Rahul");
	System.out.println(v);
	
	System.out.println();
	
	
	//there are only two operation or methods in enumeration.
	//Enumeration is only use for legacy class like vector and stack
	Enumeration e = v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
   }
}
