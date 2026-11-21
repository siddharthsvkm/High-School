
/**
 * This class defines a Square object by extending Rectangle and has legth equal to width.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class Square4 extends Rectangle4
{
    // Constructor for objects of class Square4
    public Square4(int l)
    {
        // call superclass
        super(l, l);
    }

    // String to display when object is printed.
    public String toString()
    {
        return " Square - " + getLength() + " X " + getWidth();
    }
}
