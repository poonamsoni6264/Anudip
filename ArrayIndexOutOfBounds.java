package arrayIndexOutOfBound;

public class ArrayIndexOutOfBounds
{
   public static void main(String[] args) 
   {
	   int[] numbers = {10, 20, 30, 40, 50};

       // Create a loop for accessing elements
       for (int i = 0; i <= numbers.length; i++) 
       {
           try
           {
               System.out.println("Element at index " + i + " -> " + numbers[i]);
           } 
           //catch the ArrayIndexOutOfBounds Exception
           catch (ArrayIndexOutOfBoundsException e) 
           {
               
               System.out.println("ArrayIndexOutOfBoundsException caught! Index " + i + " is out of bounds.");
           }
       }
   }
}
