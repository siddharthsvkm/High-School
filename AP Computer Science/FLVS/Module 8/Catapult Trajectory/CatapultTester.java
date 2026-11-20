
/**
 * Catapult tester class
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class CatapultTester
{
    // Prints data in feet
    public static void printResults(double[][] twoDimArray)
    {
        System.out.printf("%40s %s\n", "Projectile Distance", "(feet)");
        System.out.printf("%5s%10s%10s%10s%10s%10s%10s\n", "MPH", "25 deg", "30 deg", "35 deg", "40 deg", "45 deg", "55 deg");
        String dash = "=================";
        System.out.println(dash + dash + dash + dash);
        int mph = 20;
        for(int row = 0; row < twoDimArray.length; row ++)
        {
            System.out.printf("%5d", mph);  
            mph += 5;
            for(int col = 0; col < twoDimArray[row].length; col ++)
            {
                System.out.printf("%10.0f", twoDimArray[row][col]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        int[] speedArray = {20, 25, 30, 35, 40, 45, 50};
        int[] angleArray = {25, 30, 35, 40, 45, 50};
        double[][] twoDimArray = new double[speedArray.length][angleArray.length];
        
        
        for(int row = 0; row < speedArray.length; row++)
        {
            for(int column = 0; column < angleArray.length; column++)
            {
                twoDimArray[row][column] = Catapult.calcDistance(speedArray[row], angleArray[column]);
            }
        }
        
        printResults(twoDimArray);
    }
}
