
 /**
 * This class defines a Beach by extending a Terrain.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */

public class Beach1 extends Terrain1
{
    private int windSpeed;

    public Beach1(int l, int w, int wS)
    {
        super(l, w);
        windSpeed = wS;
    }

    public int getWindSpeed()
    {
        return windSpeed;
    }
    
    public String getBeachSize()
    {
        return "Beach Land has dimensions " + getLength() + " X " + getWidth() + 
        " and has " + getWindSpeed() + " mph wind speed";
    }
}
