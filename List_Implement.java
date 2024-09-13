package collection_framework;


import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;



public class List_Implement 
{
    public static void main(String[] args) 
    {
    	//All Implement class of List Interface 
    	//This is index based system
	    List<Integer> l = new ArrayList();
	    l.add(10);
	    l.add(124);
	    l.add(131);
	    System.out.println("ArrayList : " + l);
		
	    List<Integer> l2 = new LinkedList<>();
	    l2.add(500);
	    l2.add(600);
	    l2.add(700);
	    System.out.println("LinkedList : " + l2);
	    
	    List<Integer> l3 = new Vector();
	    l3.add(11);
	    l3.add(465);
	    l3.add(821);
	    System.out.println("Vector : "+ l3);
	    
	    List<Integer> l4 = new Stack();
	    l4.add(2054);
	    l4.add(5646);
	    l4.add(3264);
	    System.out.println("Stack : " + l4);
	}
}
