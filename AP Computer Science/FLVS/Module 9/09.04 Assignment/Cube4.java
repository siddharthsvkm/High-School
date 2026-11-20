
/**
 * This class defines a Cube object by extending Box and includes dimensions of the same value.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class Cube4 extends Box4
{
    // Constructor for objects of class Cube
    public Cube4(int l)
    {
        super(l, l, l);
    }

    // String to display when object is printed.
    public String toString()
    {
        return " Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
