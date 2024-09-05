package factorial;


	import java.util.Scanner;

	public class Strong_Number {

	    // Method to calculate factorial of a digit
	    public static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    // Method to check if a number is a Strong number
	    public static boolean isStrongNumber(int num) {
	        int sum = 0;
	        int originalNum = num;

	        // Calculate the sum of factorial of digits
	        while (num > 0) {
	            int digit = num % 10;
	            sum += factorial(digit);
	            num /= 10;
	        }

	        // Check if the sum is equal to the original number
	        return sum == originalNum;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check and display if the number is a Strong number
	        if (isStrongNumber(number)) {
	            System.out.println(number + " is a Strong number.");
	        } else {
	            System.out.println(number + " is not a Strong number.");
	        }

	        scanner.close();
	    }
	}


