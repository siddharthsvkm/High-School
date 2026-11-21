
/**
 * This class defines a Parallelogram4 object using length and width.
 *
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class Parallelogram4
{
    // instance variables
    private int length, width;

    // Constructor for objects of class Parallelogram4
    public Parallelogram4(int b, int h)
    {
        // initialize instance variables
        length = b;
        width = h;
    }

    // return the base
    public int getLength()
    {
        return length;
    }

    // return the height
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.
    public String toString()
    {
        return " Parallelogram - " + length + " X " + width;
    }
    
    public boolean equals(Object comparison)
    {
        if(!(comparison instanceof Parallelogram4))
        {
            return false;
        }
        
        Parallelogram4 values = (Parallelogram4)comparison;
        return values.getLength() == getLength() && values.getWidth() == getWidth();
    }
}
