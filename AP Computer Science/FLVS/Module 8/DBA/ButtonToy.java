
/**
 * Write a description of class ButtonToy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ButtonToy
{
    /***
    * precondition: rowH and colH each contain at least two values > 0
    *
    */

    public static int[][] calcMagicMath(int[] rowH, int[] colH){
        // to be completed in part a
        int rowLength = rowH.length;
        int colLength = colH.length + 1;
        int[][] buttonMatrix = new int[rowLength][colLength];
        
        for (int col = 0; col < colLength; col++)
        {   
            int colHeader;
            if (col == colLength - 1)
            {
                colHeader = (int)(Math.random() * 28) + 3;
            }
            else
            {
                colHeader = colH[col];
            }
            for (int row = 0; row < rowLength; row++)
            {
                int rowHeader = rowH[row];
                
                buttonMatrix[row][col] = colHeader * rowHeader;
            }
        }
        
        return buttonMatrix;
    }
    
    
    /**
    *
    * precondition: twoD is neither null nor empty
    *
    */
    public static ArrayList<Integer> oddNumbers(int[][] twoD)
    {
        // to be completed in part b
        ArrayList<Integer> oddNums = new ArrayList<Integer>();
        
        for (int row = twoD.length - 1; row >= 0; row--)
        {
            for (int col = 0; col < twoD[0].length; col++)
            {   
                if (twoD[row][col] % 2 == 1)
                {
                    oddNums.add(twoD[row][col]);
                }
            }
        }
        
        return oddNums;
    }   
    
    
    public static void main(String[] args)
    {
        int[] cols = {2, 3, 6, 7};
        int[] rows = {3, 6, 9};
        ArrayList<Integer> ints = oddNumbers(calcMagicMath(cols, rows));
        for (int x: ints)
        {
            System.out.print(x + " ");
        }
    }
}
