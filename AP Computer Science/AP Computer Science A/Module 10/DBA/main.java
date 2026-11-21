
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String [] args)
    {
        int[] usYears = { 1925, 1920, 1908};
        double[] usValues = { 0.25, 0.50, 1.00};
        String[] usCountries = { "US", "US", "US"};
        
        USCoinCollection first = new USCoinCollection(usYears, usValues, usCountries);
        System.out.println(first.isRare(1930));
        
        int[] Years = { 1930, 1925, 1925};
        double[] Values = { 1.00, 0.25, 0.05};
        String[] Countries = { "Mexico", "US", "Britain"};
        
        CoinCollection second = new CoinCollection(Years, Values, Countries);
        System.out.println(second.isRare(1930));
    }
}
