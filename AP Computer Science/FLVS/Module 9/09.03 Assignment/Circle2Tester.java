
/**
 * This class tests the Circle2 class hierarchy.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */

import java.util.ArrayList;
public class Circle2Tester
{
    public static void showCenter(ArrayList<Circle2> circles)
    {
        for (Circle2 circle: circles)
        {
            System.out.println(" For this " + circle.getClass().getName() + " the " + circle.getCenter());
        }
    }
    
    public static void main(String[] args)
    {
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        circles.add(new Circle2(2, 4, 5));
        circles.add(new Cylinder2(10, 15, 5, 2));
        circles.add(new Oval2(25, 10, 6, 7));
        circles.add(new OvalCylinder2(40, 10, 4, 9, 5));
        
        showCenter(circles);
    }
}
