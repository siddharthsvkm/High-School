
/**
 * This class defines a Rectangle object using length and width.
 *
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class Rectangle4 extends Parallelogram4
{
    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        super(l, w);
    }

    // String to display when object is printed.
    public String toString()
    {
        return " Rectangle - " + getLength() + " X " + getWidth();
    }
}
