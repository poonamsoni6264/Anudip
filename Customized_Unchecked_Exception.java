package customized_exception;

class UnderAgeException extends RuntimeException
{
	UnderAgeException()
	{
		super("You are under age");
	}
	UnderAgeException(String message)
	{
		super(message);
	}
}

public class Customized_Unchecked_Exception 
{

	 public static void main(String args[]) //throws UnderAgeException
	    {
	    	int age = 15;
	    	try
	    	{
	    	  if(age < 18)
	    	  {
	    		throw new UnderAgeException();
	    	  }
	    	  else
	    	  {
	    		System.out.println("You can vote");
	    	  }
	        }
	    	catch(UnderAgeException e)
	    	{
	    		e.printStackTrace();
	    	}
	    	
	    	System.out.println("hello");
	    	
	    }
}
