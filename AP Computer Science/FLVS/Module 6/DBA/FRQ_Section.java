
/**
 * Write a description of class FRQ_Section here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FRQ_Section
{
        
    public static double pandaCalc(double[] data)
    {
        double[] weights = new double[data.length];
        double min = data[0];
        double max = data[0];
        double total = 0;
        int elements = 0;
        
        for (int x = 0; x < data.length; x++)
        {
            weights[x] = data[x];
            if (weights[x] > max)
                max = weights[x];
            if (weights[x] < min)
                min = weights[x]; 
        }
        
        for (int x = 0; x < data.length; x++)
        {
            if (weights[x] != min || weights[x] != max)
            {        
                total += weights[x];
                elements += 1;
            }
        }
        double average = total/elements;
        return average; 
    }
    
    public static void main(String [] args)
    {
       double[] bambooWeights = {43.1, 45.3, 40.0, 44.5, 46.2, 41.8, 44.0, 47.5, 42.1, 44.9};
       System.out.println(pandaCalc(bambooWeights));
    }
}
