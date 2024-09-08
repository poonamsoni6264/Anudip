package throw_keyword;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String message)
	{
		super(message);
	}
}


public class Throw_Keyword 
{
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Your Age");
	   int age = sc.nextInt();
	   
	   try
	   {
		   if(age < 18)
		   {
			   throw new YoungerAgeException("You are not eligible for voting ");
		   }
		   else
		   {
			   System.out.println("You can vote Successfully");
		   }
	   }
	   catch(YoungerAgeException e)
	   {
		   e.printStackTrace();
	   }
	   System.out.println("hello");
   }
}
