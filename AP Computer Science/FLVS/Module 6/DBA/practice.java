
/**
 * Write a description of class practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class practice
{
    public static void main(String [] args)
    {
        int variable = 5;
        System.out.printf("", variable);
    }
    
    public static int evenNumberOperations()
    {
        int[] evenNumbers = new int[5];
        int product = 1; 
        for (int x = 1; x < 6; x++)
        {
            evenNumbers[x - 1] = x * 2;
        }
        
        for (int value: evenNumbers)
        {
            product *= value;
        }
        
        
        return product;    
    }
    
    public static void newArray() 
    {
        double[ ] a1 = {1.2, 2.3, 3.4, 8.5, 5.6};
        double[ ] a2 = {1.0, 4.0, 3.0, 4.0, 10.0};
        

        // Assume that there is code here that prompts the user to enter these double
        // values and stores them in a1 and a2. You don't know what the user will type, but
        // you may assume that the code is correct and no errors occur in this portion of the program.

        // Complete this part of the method
        
        int length; // Do assume a1 and a2 are same length?
        if (a1.length <= a2.length)
            length = a1.length;
        else
            length = a2.length;
            
        double[] result = new double[length];
        
        for (int x = 0; x < length; x++)
        {
            result[x] = a1[x] - a2[x]; // decimal subtraction gives incorrect answers for some reason
        }
        
        System.out.println("{");
        for (double value : result) {
            System.out.println(value); // or System.out.printf("%.2f ", value);
        }   
        System.out.println("}");
    }
    
    public static String triangleSimilar(int t1side1, int t1side2, int t1side3, int t2side1,int t2side2,int t2side3)
    {
        double ratio1a = (double)t1side1 / t1side2;
        double ratio2a = (double)t1side1 / t1side3;
        double ratio3a = (double)t1side2 / t1side3;
        
        double ratio1b = (double)t2side1 / t2side2;
        double ratio2b = (double)t2side1 / t2side3;
        double ratio3b = (double)t2side2 / t2side3;
        
        if (ratio1a == ratio1b && ratio2a == ratio2b && ratio3a == ratio3b)
            return "The triangles are similar.";
        else
            return "The triangles are not similar.";
    }

}
