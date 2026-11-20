
 /**
 * This class defines a Forest by extending a Terrain.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */

public class Forest1 extends Terrain1
{
    // instance variables
    private int trees;
    public Forest1(int l, int w, int t)
    {
        super(l, w);
        trees = t;
    }

    public int getTrees()
    {
        return trees;
    }
    
    public String getForestSize()
    {
        return "Forest Land has dimensions " + getLength() + " X " + getWidth() + " and has " + getTrees() + " trees";
    }
}
