package collection_framework;

//import java.util.*;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;

public class Set_Implement 
{
   public static void main(String[] args) 
   {
	   //This is not index based
	   //It is not allows duplicate values.
	   //It cannot store mutiple null values.
	   Set<Integer> sh = new HashSet();
	   sh.add(100);
	   sh.add(500);
	   sh.add(300);
	   System.out.println("HashSet : " + sh);
		  
		  
	  Set<Integer> s = new LinkedHashSet(); 
	  s.add(12120);
	  s.add(13510);
	  s.add(1401);
	  System.out.println("LinkedHashSet : " + s);
	  
	  Set<Integer> ts = new TreeSet();
	  ts.add(1234);
	  ts.add(154);
	  ts.add(4554);
	  System.out.println("TreeSet : " + ts);

	   //iterator only work here listiterator is not working in set interface.
	    Iterator itr=sh.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println("This is iterator function : " + itr.next());
	    }
   }
}
