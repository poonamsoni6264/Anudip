package reversestring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		//create a object of ArrayList class of List Interface
		List<String> rs = new ArrayList<>();
		
		//Add element in a ArrayList
		rs.add("Poonam");
		rs.add("Dheeraj");
		rs.add("Sonu");
		rs.add("Ram");
		rs.add("Riya");
		
		//print the elements list
		System.out.println("Before reverse elements : " + rs);
		
		//reverse the elements
		Collections.reverse(rs);
		
		//print the reverse elements
		System.out.println("Reverse elements : " + rs);
		
	}
}
