package array_Problem;

import java.util.Arrays;
import java.util.Collections;

public class Array_Problem {
    public static void main(String[] args) {
    	// Step 1 : Declare and initialize the array
    	int array[] = {2,4,5,3,6,7,9,4,5,6};
    	
    	//Step 2 : Extract the subArray from index 2 to 6 (inclusive)
    	int subArray[] = Arrays.copyOfRange(array,  2, 7);
    	// 7 is exclusive , so it takes elements from index 2 to 6
    	
    	// Output the subArray
    	
    	System.out.print("Sub array: ");
    	
    	for(int num : subArray) {
    		System.out.print(num + " ");
    	}
    	System.out.println();
    	
    	//Step 3 : Find the 2nd highest number in the subArray
    	//Sort the subArray in descending order
    	
    	Integer[] subArrayInteger = Arrays.stream(subArray).boxed().toArray(Integer[] :: new); 
    	
    	Arrays.sort(subArrayInteger,Collections.reverseOrder());
    	
    	//The 2nd highest element will be at index 1 after sorting in descending order 
    	
    	int secondHighest = subArrayInteger[1];
    	//Output the second highest element 
    	
    	System.out.println("2nd Highest element : " + secondHighest);
    	
    }
}
