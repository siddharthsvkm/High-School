
 /**
 * This class defines a basic Terrain.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */

public class Terrain1
{
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain1(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    
    public String getTerrainSize()
    {
        return "Land has dimensions " + getLength() + " X " + getWidth();
    }
}
