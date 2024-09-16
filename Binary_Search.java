package array_questions;

public class Binary_Search 
{
	public static int BinarySearch(int arr[], int key)
	{
		int start=0;
		int end= arr.length-1;
		
		while(start <= end)
		{
			int mid = (start + end)/2;
			//search key value
			if(arr[mid] == key)
			{
				return mid;
			}
			else if(arr[mid] < key) 
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int arr[] = {2,4,6,8,10,12,14};
		int key = 10;
		System.out.println("Index of key value at : " + BinarySearch(arr,key));
	}
}
