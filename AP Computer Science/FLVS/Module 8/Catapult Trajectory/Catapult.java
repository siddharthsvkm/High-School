
/**
 * Catapult object class
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class Catapult
{
    public Catapult()
    {
    }

    // Calculates the distance of a projectile from the speed and angle
    public static double calcDistance(int speed, int angle)
    {
        double feetInMeter = 3.2808; // Feet in a meter
        double distance = (speed * speed) * Math.sin(2 * Math.toRadians(angle)) / 9.8; // Calculation
        distance *= feetInMeter; // Convert to feet
        
        return distance;
    }
}
