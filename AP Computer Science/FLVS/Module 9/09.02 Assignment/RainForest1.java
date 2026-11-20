
 /**
 * This class defines a RainForest by extending a Forest.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */

public class RainForest1 extends Forest1
{
    // instance variables
    private int precipitation;
    
    public RainForest1(int l, int w, int t, int p)
    {
        super(l, w, t);
        precipitation = p;
    }

    public int getPrecipitation()
    {
        return precipitation;
    }
    
    public String getRainForestSize()
    {
        return "Rainforest Land has dimensions " + getLength() + " X " + getWidth() + 
        " and has " + getTrees() + " trees and has " + getPrecipitation() + " mm of rainfall" ;
    }
}
