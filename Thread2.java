package multithreading;

//this is 2nd to create thread
public class Thread2 implements Runnable
{

	public void run()
	{
		System.out.println("create thread by runnable interface");
	}
	
	public static void main(String[] args) 
	{
		Thread2 t2 = new Thread2();
		Thread th = new Thread(t2);
		th.start();
	}
}
