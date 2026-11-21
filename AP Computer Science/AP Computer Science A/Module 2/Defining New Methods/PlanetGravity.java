/**
 * The purpose of this program is to determine the surface gravity (g) on a planet in our solar system.
 *
 * @author Siddharth Sivakumar
 * @version September 2024
 */
public class PlanetGravity
{
    public static double gravityCalculation(double diameter, double mass, double gravitationalConstant)
    {
        double g = gravitationalConstant;
        double m = mass;
        double r = diameter / 2;
        
        double result = g * m / Math.pow(r, 2); 
        double roundedResult = (int)(result * 100.00)/100.00;
        return roundedResult;
    }
    public static void planetHeader()
    {
        String tab = "\t";
        String center = "\t\t\t";
        System.out.println(center + "  " + "Planetary Data" + center);
        System.out.println("  Planet" + tab + "Diameter (km)" + tab + "Mass (kg)" + tab + "g (m/s^2)");
        System.out.println("-------------------------------------------------------------------");
    }
    public static String planetData(String name, double diameter, double mass, double gravity)
    {
        String tab = "\t";
        String data = "  " + name + tab + diameter + tab + mass + tab + gravity;
        return data;
    }
    public static void main(String[] args)
    {
        String planetName = "Mercury";
        double planetDiameterkm = 4880;
        double planetDiameter = planetDiameterkm * 1000;
        double planetMass = 3.30E+23;
        double planetGravitationalConstant = 6.674e-11; // Researched Gravitational Constant
        
        planetHeader();
        double planetGravity = gravityCalculation(planetDiameter, planetMass, planetGravitationalConstant);
        System.out.println(planetData(planetName, planetDiameterkm, planetMass, planetGravity));
        
    }
}
