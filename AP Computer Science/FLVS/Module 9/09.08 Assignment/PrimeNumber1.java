
/**
 * PrimeNumber object class
 * The purpose of this program is to calculate and count 
 * the quantity of prime numbers in a given range.
 *
 * @author Siddharth Sivakumar
 * @version February 2025
 */
public class PrimeNumber1
{
    // instance variables
    private int lowerBound, upperBound, count;
    
    /**
     * Constructor for objects of class PrimeNumber
     */
    public PrimeNumber1(int lower, int upper)
    {
        this.lowerBound = lower;
        this.upperBound = upper;
        this.count = 0;
    }
    
    // Method to dtermine whether a number is prime
    public static boolean isPrime(int number)
    {
        boolean prime = true;
        int condition = (number / 2) + 1;
        if (number == 0 || number == 1)
        {
            return false;
        }
        for (int x = 2; x < condition; x++)
        {
            if (number % x == 0)
            {
                prime = false;
                break;
            }
        }
        
        return prime;
    }
    
    // Method to iterate through range of numbers and prints numbers un user-friendly format
    public void primeNumberRange()
    {
        int[] primeNums = new int[upperBound- lowerBound];
        for (int x = lowerBound + 1; x < upperBound; x++) //numbers within the lower and upper limits
        {
            if (isPrime(x) == true)
            {
                primeNums[count] = x;
                count += 1;
            }
        }
        
        System.out.println();
        System.out.println();
        System.out.println(" Prime Number Count: " + count);
        System.out.println(" Prime Numbers:");
        
        for (int y = 0; y < count; y++)
        {
            if (y % 6 == 5)
            {
                System.out.printf("%10d \n", primeNums[y]);
            }
            else
            {
                System.out.printf("%10d", primeNums[y]);
            }
        }
    }
    
    // Method to return count
    public int getPrimeCount()
    {
        return count;
    }
}
