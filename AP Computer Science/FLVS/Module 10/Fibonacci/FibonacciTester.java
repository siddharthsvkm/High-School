
/**
 * Fibonacci tester class
 *
 * @author Siddharth Sivakumar
 * @version February 2025
 */

import java.util.Scanner;
public class FibonacciTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
         
        
        while (true)
        {
            System.out.print("Enter the index number to calculate the fibonacci number (0-35): ");
            int number = Integer.parseInt(in.nextLine());
            if (number > 35 || number < 0)
            {
                while (number > 35 || number < 0)
                {
                    System.out.print("Please enter a valid index number (0-35): ");
                    number = Integer.parseInt(in.nextLine());
                }
            }
                
            int fibonacciNum = Fibonacci.fibonacciNumber(number);
            System.out.println("Fibonacci Number " + number + ": " + fibonacciNum);
            System.out.println();
            
            System.out.print("Would you like to continue? (Y/N): ");
            String response = in.nextLine();
            if (response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no"))
                break;
            System.out.println();
            System.out.println();
        }
    }
}
