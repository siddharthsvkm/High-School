
/**
 * Fibonacci implementation class
 *
 * @author Siddharth Sivakumar
 * @version February 2025
 */
public class Fibonacci
{
    public static int fibonacciNumber(int num)
    {
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
        {
            return fibonacciNumber(num - 1) + fibonacciNumber(num - 2);
        }
    }
}
