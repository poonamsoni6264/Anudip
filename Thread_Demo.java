package multithreading;

//there are two ways to create thread 1st extends the Thread class and 2nd is implement the Runnable interface
//this is 1st way to create Thread
public class Thread_Demo extends Thread
{

	public void run()
	{
		System.out.println("Thread task");
	}
	
	public static void main(String[] args) 
	{
		Thread t = new Thread_Demo();
		t.start();
	}
}

