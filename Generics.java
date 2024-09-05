package practice;

class Generic<T, T2>
{
	T age;
	T2 name;
}



public class Generics
{
	public static void main(String[] args)
	{
		Generic<Integer, String> g = new Generic<Integer, String>();
		g.age = 22;
		g.name = "Poonam";
		System.out.println(g.age);
		System.out.println(g.name);
		
		
		
	}
}