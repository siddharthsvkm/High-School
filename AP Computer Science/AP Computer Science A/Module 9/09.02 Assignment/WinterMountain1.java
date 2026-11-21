
 /**
 * This class defines a WinterMountain by extending a Mountain.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */

public class WinterMountain1 extends Mountain1
{
    // instance variable
    private double temperature;
    
    public WinterMountain1(int l, int w, int m, double t)
    {
        super(l, w, m);
        temperature = t;
    }

    public double getTemperature()
    {
        return temperature;
    }
    
    public String getWinterMountainSize()
    {
        return "Winter Mountain Land has dimensions " + getLength() + " X " + getWidth() + 
        " and has " + getMountains() + " mountains and temperature " + getTemperature() + " degrees";
    }
}
