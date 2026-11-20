
 /**
 * This class defines a Mountain by extending a Terrain.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */

public class Mountain1 extends Terrain1
{
    // instance variable
    private int mountains;
    
    public Mountain1(int l, int w, int m)
    {
        super(l, w);
        mountains = m;
    }

    public int getMountains()
    {
        return mountains;
    }
    
    public String getMountainSize()
    {
        return "Mountain Land has dimensions " + getLength() + " X " + getWidth() + " and has " + getMountains() + " mountains";
    }
}
