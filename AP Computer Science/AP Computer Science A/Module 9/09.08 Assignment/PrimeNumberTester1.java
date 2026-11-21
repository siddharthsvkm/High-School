
/**
 * PrimeNumberTester implementation/tester class
 *
 * @author Siddharth Sivakumar
 * @version February 2025
 */

import java.util.Scanner;
public class PrimeNumberTester1
{
    public static void main(String[] args)
    {
          Scanner in = new Scanner(System.in);
          System.out.println(" Prime Number Range Calculator");
          
          System.out.print("  Enter the lower limit for the prime number range: ");
          int lowerBound = in.nextInt();
          in.nextLine();    
          System.out.print("  Enter the upper limit for the prime number range: ");
          int upperBound = in.nextInt();
          in.nextLine();
          
          PrimeNumber1 pRange = new PrimeNumber1(lowerBound, upperBound);
          pRange.primeNumberRange();
          
    }
}
