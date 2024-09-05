package Maximum_Number;

import java.util.Scanner;

public class  Maximum_Two_Num {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // ternary operator
        int max = (num1 > num2) ? num1 : num2;

        // Print the maximum number
        System.out.println("The maximum number between " + num1 + " and " + num2 + " is: " + max);
        
        // Close the scanner
        scanner.close();
    }
}

