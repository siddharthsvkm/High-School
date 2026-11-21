
/**
 * Write a description of class CoinCollection here.
 *
 * @author Siddharth Sivakumar
 * @version March 2025
 */

import java.util.ArrayList;
public class CoinCollection{
    private ArrayList<Coin> coins; //collection of coins
    //precondition: parallel arrays of all the same length
    //write the constructor of CoinCollection for part A
    public CoinCollection(int[] years, double[] values, String[] countries)
    {
        //to be completed in part A
        coins = new ArrayList<>();
        for (int x = 0; x < years.length; x++)
        {
            coins.add(new Coin(years[x], values[x], countries[x]));
        }
    }
    //there may be other constructors and methods not shown
    public boolean isRare(int year)
    {
        //to be completed in part B
        for (int x = 0; x < coins.size(); x++)
        {
            if (coins.get(x).getYear() >= year)
            {
                return false;
            }
        }
        return true;
    }
}
