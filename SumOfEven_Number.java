package evensum;

import java.util.ArrayList;


public class SumOfEven_Number 
{

	public static void main(String[] args) 
	{
		//Create a object of ArrayList
		ArrayList<Integer> en = new ArrayList<>();
		
		//add some integers in list
		en.add(20);
		en.add(15);
		en.add(14);
		en.add(18);
		en.add(25);
		
		//Calculate the sum of even number
		int Sum = 0;
		
		for(int ens : en) 
		{
			if(ens % 2 == 0)
			{
				Sum += ens;
			}
		}
		
		//Print the sum of even number
		System.out.println(Sum);
	}
}
